import entities.User;
import orm.EntityManager;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

import static orm.MyConnector.createConnection;
import static orm.MyConnector.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException,
            InvocationTargetException, NoSuchMethodException, InstantiationException {

        createConnection("root", "Aa123456", "mini_orm");

        Connection connection = getConnection();


        EntityManager<User> entity = new EntityManager<>(connection);

        //User user = new User("Pesho", 40, LocalDate.of(2021, 6, 20));

        //entity.persist(user);

        User found = entity.findFirst(User.class, "age > 30");

    }
}
