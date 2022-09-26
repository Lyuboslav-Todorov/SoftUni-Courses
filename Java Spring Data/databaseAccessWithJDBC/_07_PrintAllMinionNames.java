
import java.sql.*;
import java.util.*;

public class _07_PrintAllMinionNames {
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

        PreparedStatement selectMinions =
                connection.prepareStatement("SELECT name FROM minions");

        ResultSet minionsNamesSet = selectMinions.executeQuery();

        List<String> minions = new ArrayList<>();

        while (minionsNamesSet.next()){
            String minion = minionsNamesSet.getString("name");
            minions.add(minion);
        }

        for (int i = 0; i < minions.size() / 2; i++) {
            System.out.println(minions.get(i));
            System.out.println(minions.get(minions.size()-i - 1));
        }

    }
}
