import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class _05_ChangeTownNamesCasing {
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

        System.out.print("Enter country name: ");
        String country = scanner.nextLine();

        PreparedStatement updateTownsToUpperCase = connection.prepareStatement("UPDATE towns\n" +
                "SET name = UPPER(name)\n" +
                "WHERE country = ?;\n");

        updateTownsToUpperCase.setString(1, country);

        int updatedCount = updateTownsToUpperCase.executeUpdate();

        if (updatedCount == 0){
            System.out.println("No town names were affected.");
            return;
        }

        System.out.printf("%d town names were affected.%n", updatedCount);

        PreparedStatement selectTowns = connection.prepareStatement("SELECT name FROM towns\n" +
                "WHERE country = ?;");
        selectTowns.setString(1, country);

        ResultSet townsSet = selectTowns.executeQuery();

        List<String> townsArr = new ArrayList<>();

        while (townsSet.next()){
            String town = townsSet.getString("name");
            townsArr.add(town);
        }

        System.out.println(townsArr);

        connection.close();
    }
}
