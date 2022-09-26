import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class _02_GetVillainsNames {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username default (root): ");
        String user = scanner.nextLine();
        user = user.equals("") ? "root" : user;
        System.out.print("Enter password default (empty): ");
        String password = scanner.nextLine().trim();

        Properties properties = new Properties();
        properties.setProperty("user", user);
        properties.setProperty("password", password);

        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", properties);

        PreparedStatement statement = connection.prepareStatement("SELECT `name`, " +
                "COUNT(DISTINCT mv.minion_id) AS minions_count FROM villains AS v\n" +
                "JOIN minions_villains AS mv on v.id = mv.villain_id\n" +
                "GROUP BY v.id\n" +
                "HAVING minions_count > 15 " +
                "ORDER BY minions_count DESC;");

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()){
            String villainName = resultSet.getString("v.name");
            int minionsCount = resultSet.getInt("minions_count");

            System.out.printf("%s %d%n", villainName, minionsCount);
        }

        connection.close();

    }



}
