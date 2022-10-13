package orm;

import Annotations.Column;
import Annotations.Entity;
import Annotations.Id;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EntityManager<E> implements DbContext<E> {
    private Connection connection;

    public EntityManager(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean persist(E entity) throws IllegalAccessException, SQLException {
        Field primaryKey = getId(entity.getClass());
        primaryKey.setAccessible(true);
        Object value = primaryKey.get(entity);
        if (value == null || (long) value <= 0) {
            return doInsert(entity, primaryKey);
        }
        return doUpdate(entity, primaryKey);
    }

    private boolean doUpdate(E entity, Field primaryKey) throws IllegalAccessException, SQLException {
        String tableName = this.getTableName(entity.getClass());
        String tableFields = getColumnsWithoutId(entity.getClass());
        String[] columns = tableFields.split(",");
        String tableValues = getColumnsValuesWithoutId(entity);
        String[] values = tableValues.split(",");

        StringBuilder builder = new StringBuilder();
        builder.append("UPDATE ").append(tableName).append(" SET ");

        for (int i = 0; i < columns.length; i++) {
            builder.append(columns[i]).append(" = ").append(values[i]);
            if (i < columns.length - 1) {
                builder.append(",");
            }
        }
        Object o = primaryKey.get(entity);
        if (o instanceof Long) {
            builder.append(" WHERE id = ").append(o).append(";");
        }
        String query = builder.toString();

        return connection.prepareStatement(query).execute();
    }

    private boolean doInsert(E entity, Field primaryKey) throws SQLException, IllegalAccessException {
        String tableName = this.getTableName(entity.getClass());
        String tableFields = getColumnsWithoutId(entity.getClass());
        String tableValues = getColumnsValuesWithoutId(entity);


        String query = String.format("INSERT INTO %s (%s) VALUES(%s)",
                tableName, tableFields, tableValues);

        return connection.prepareStatement(query).execute();
    }

    private String getColumnsValuesWithoutId(E entity) throws IllegalAccessException {
        Class<?> aClass = entity.getClass();

        List<Field> fields = Arrays.stream(aClass.getDeclaredFields())
                .filter(f -> !f.isAnnotationPresent(Id.class))
                .filter(f -> f.isAnnotationPresent(Column.class)).toList();

        List<String> values = new ArrayList<>();

        for (Field field : fields) {
            field.setAccessible(true);
            Object o = field.get(entity);

            if (o instanceof String || o instanceof LocalDate) {
                values.add("'" + o + "'");
            } else {
                values.add(o.toString());
            }
        }

        return String.join(",", values);
    }

    private String getColumnsWithoutId(Class<?> aClass) {
        return Arrays.stream(aClass.getDeclaredFields())
                .filter(f -> !f.isAnnotationPresent(Id.class))
                .filter(f -> f.isAnnotationPresent(Column.class))
                .map(f -> f.getAnnotationsByType(Column.class))
                .map(a -> a[0].name())
                .collect(Collectors.joining(","));
    }

    private String getTableName(Class<?> aClass) {
        Entity[] annotationsByType = aClass.getAnnotationsByType(Entity.class);
        if (annotationsByType.length == 0) {
            throw (new UnsupportedOperationException("Class must be Entity"));
        }
        return annotationsByType[0].name();
    }

    public Field getId(Class<?> entity) {
        return Arrays.stream(entity.getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(Id.class))
                .findFirst()
                .orElseThrow(() -> new UnsupportedOperationException("Entity does not have primary key"));
    }

    @Override
    public Iterable<E> find(Class<E> table) throws SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Statement statement = connection.createStatement();

        String tableName = getTableName(table);

        String query = String.format("SELECT * FROM %s", tableName);

        ResultSet resultSet = statement.executeQuery(query);

        return getEntities(table, resultSet);
    }

    @Override
    public Iterable<E> find(Class<E> table, String where) throws SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Statement statement = connection.createStatement();

        String tableName = getTableName(table);

        String query = String.format("SELECT * FROM %s%s;",
                tableName, where != null ? " WHERE " + where : "");

        ResultSet resultSet = statement.executeQuery(query);

        return getEntities(table, resultSet);
    }

    @Override
    public E findFirst(Class<E> table) throws SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Statement statement = connection.createStatement();

        String tableName = getTableName(table);

        String query = String.format("SELECT * FROM %s LIMIT 1", tableName);

        ResultSet resultSet = statement.executeQuery(query);

        return getEntity(table, resultSet);
    }

    @Override
    public E findFirst(Class<E> table, String where) throws SQLException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Statement statement = connection.createStatement();

        String tableName = getTableName(table);

        String query = String.format("SELECT * FROM %s %s LIMIT 1;",
                tableName, where != null ? " WHERE " + where : "");

        ResultSet resultSet = statement.executeQuery(query);

        return getEntity(table, resultSet);
    }

    public void doCreate(Class<E> entityClass) throws SQLException {
        String tableName = getTableName(entityClass);

        String fieldsWithTypes = getAllFieldsAndDataTypes(entityClass);

        String query = String.format("CREATE TABLE %s ( id INT PRIMARY KEY AUTO_INCREMENT, %s);",
                tableName, fieldsWithTypes);

        PreparedStatement statement = connection.prepareStatement(query);

        statement.execute();
    }

    private String getAllFieldsAndDataTypes(Class<E> entityClass) {
        StringBuilder builder = new StringBuilder();

        Field[] fields = Arrays.stream(entityClass.getDeclaredFields())
                .filter(f -> !f.isAnnotationPresent(Id.class))
                .filter(f -> f.isAnnotationPresent(Column.class))
                .toArray(Field[]::new);

        Arrays.stream(fields).forEach(f -> {
            builder.append(getNameAndDataTypeOfField(f));
        });

        return builder.toString();
    }

    private String getNameAndDataTypeOfField(Field f) {

        if (f.getType() == int.class || f.getType() == Integer.class) {
            return f.getName() + " INT";
        } else if (f.getType() == String.class) {
            return f.getName() + " VARCHAR(50)";
        }


        return "";
    }

    private E getEntity(Class<E> table, ResultSet resultSet) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SQLException {
        E entity = table.getDeclaredConstructor().newInstance();

        resultSet.next();

        fillEntity(table, resultSet, entity);
        return entity;
    }

    private List<E> getEntities(Class<E> table, ResultSet resultSet) throws SQLException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        List<E> entities = new ArrayList<>();

        while (resultSet.next()) {
            E entity = table.getDeclaredConstructor().newInstance();

            fillEntity(table, resultSet, entity);

            entities.add(entity);
        }
        return entities;
    }

    private void fillEntity(Class<E> table, ResultSet resultSet, E entity) throws SQLException, IllegalAccessException {
        Field[] declaredFields = Arrays.stream(table.getDeclaredFields())
                .toArray(Field[]::new);

        for (Field field : declaredFields) {
            field.setAccessible(true);
            fillField(field, resultSet, entity);
        }
    }

    private void fillField(Field field, ResultSet resultSet, E entity) throws SQLException, IllegalAccessException {
        field.setAccessible(true);

        if (field.getType() == int.class || field.getType() == long.class) {
            field.set(entity, resultSet.getInt(field.getName()));
        } else if (field.getType() == LocalDate.class) {
            field.set(entity, LocalDate.parse(resultSet.getString(field.getName())));
        } else {
            field.set(entity, resultSet.getString(field.getName()));
        }

    }
}
