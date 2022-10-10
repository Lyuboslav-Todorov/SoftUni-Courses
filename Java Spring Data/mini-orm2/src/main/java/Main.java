import entities.User;
import orm.EntityManager;

import java.sql.Connection;
import java.sql.SQLException;

import static orm.MyConnector.createConnection;
import static orm.MyConnector.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException {

        createConnection("root", "Aa123456", "mini_orm");

        Connection connection = getConnection();


        EntityManager<User> entity = new EntityManager<>(connection);

    }
}
