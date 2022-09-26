import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class _06_RemoveVillain {
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
        connection.setAutoCommit(false);

        System.out.print("Enter villain ID: ");
        int villainId = Integer.parseInt(scanner.nextLine());

        String villainName = getVillainName(connection, villainId);

        if (villainName == null) {
            System.out.println("No such villain was found");
            return;
        }

        try {
            PreparedStatement deleteMinionsVillains =
                    connection.prepareStatement("DELETE FROM minions_villains WHERE villain_id = ?");
            deleteMinionsVillains.setInt(1, villainId);
            int releasedMinions = deleteMinionsVillains.executeUpdate();

            PreparedStatement deleteVillain = connection.prepareStatement("DELETE FROM villains\n" +
                    "WHERE id = ?;");
            deleteVillain.setInt(1, villainId);
            deleteVillain.executeUpdate();

            connection.commit();
            System.out.printf("%s was deleted%n%d minions released", villainName, releasedMinions);

        } catch (SQLException e) {
            connection.rollback();
        }



    }

    private static String getVillainName(Connection connection, int villainId) throws SQLException {
        PreparedStatement selectVillain =
                connection.prepareStatement("SELECT name FROM villains WHERE id = ?");
        selectVillain.setInt(1, villainId);
        ResultSet villainName = selectVillain.executeQuery();

        if (!villainName.next()) {
            return null;
        }
        return villainName.getString("name");
    }
}
