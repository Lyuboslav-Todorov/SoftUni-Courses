import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class _09_IncreaseAgeStoredProcedure {
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

        System.out.print("Enter minion ID: ");
        int minionId = Integer.parseInt(scanner.nextLine());

        CallableStatement statement = connection.prepareCall("CALL usp_get_older(?)");
        statement.setInt(1, minionId);

        statement.executeUpdate();

        PreparedStatement selectMinion =
                connection.prepareStatement("SELECT name, age FROM minions WHERE id = ?");
        selectMinion.setInt(1, minionId);

        ResultSet minion = selectMinion.executeQuery();
        minion.next();
        String minionName = minion.getString("name");
        int minionAge = minion.getInt("age");
        System.out.println(minionName + " " + minionAge);

    }
}
