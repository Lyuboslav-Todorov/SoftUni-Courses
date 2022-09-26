import java.sql.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class _08_IncreaseMinionsAge {
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

        System.out.print("Enter minions IDs: ");
        int[] minionsIds = Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < minionsIds.length; i++) {
            int minionId = minionsIds[i];
            PreparedStatement increaseAge = connection.prepareStatement("UPDATE minions\n" +
                    "SET age = age + 1, name = LOWER(name)\n" +
                    "WHERE id = ?;");

            increaseAge.setInt(1, minionId);

            increaseAge.executeUpdate();
        }

        PreparedStatement selectMinions = connection.prepareStatement("SELECT name, age FROM minions;");
        ResultSet minionsSet = selectMinions.executeQuery();

        while (minionsSet.next()){
            String name = minionsSet.getString("name");
            int age = minionsSet.getInt("age");
            System.out.println(name + " " + age);
        }

        connection.close();
    }
}
