import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class _03_GetMinionNames {

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

        PreparedStatement statement =
                connection.prepareStatement("SELECT v.name,  m.name, m.age FROM villains AS v\n" +
                        "JOIN minions_villains AS mv on v.id = mv.villain_id\n" +
                        "JOIN minions AS m on m.id = mv.minion_id\n" +
                        "WHERE v.id = ?\n" +
                        "GROUP BY m.id;");

        System.out.print("Choose villain id: ");

        int villainId = Integer.parseInt(scanner.nextLine());
        statement.setInt(1, villainId);

        ResultSet resultSet = statement.executeQuery();

        printVillainAndHesMinions(resultSet, villainId);

        connection.close();
    }


    private static void printVillainAndHesMinions(ResultSet resultSet, int villainId) throws SQLException {
        if (!resultSet.next()) {
            System.out.printf("No villain with ID %d exists in the database.", villainId);
        } else {
            System.out.println("Villain: " + resultSet.getString("v.name"));
            int counter = 1;
            do {
                String minionName = resultSet.getString("m.name");
                int minionAge = resultSet.getInt("m.age");
                System.out.printf("%d. %s %d%n", counter++, minionName, minionAge);
            } while (resultSet.next());
        }
    }



}
