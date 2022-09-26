import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class _04_AddMinion {
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

        String[] minionInfo = scanner.nextLine().split("\\s");
        String minionName = minionInfo[1];
        int minionAge = Integer.parseInt(minionInfo[2]);
        String minionTown = minionInfo[3];

        String[] villainInfo = scanner.nextLine().split(": ");
        String villainName = villainInfo[1];

        int townId = getTownId(connection, minionTown);
        int villainId = getVillainId(connection, villainName);
        insertMinion(connection, townId, villainName, minionName, minionAge, villainId);

    }

    private static void insertMinion(Connection connection, int townId, String villainName,
                                     String minionName, int minionAge, int villainId) throws SQLException {
        PreparedStatement insertMinion = connection.prepareStatement("INSERT INTO minions \n" +
                "VALUES (?, ?, ?)");

        insertMinion.setString(1, minionName);
        insertMinion.setInt(2, minionAge);
        insertMinion.setInt(3, townId);

        PreparedStatement selectMinionId = connection.prepareStatement("SELECT id FROM minions " +
                "ORDER BY id DESC LIMIT 1");

        ResultSet lastMinionSet = selectMinionId.executeQuery();
        lastMinionSet.next();
        int minionId = lastMinionSet.getInt("id");

        PreparedStatement insertMinionsVillains = connection.prepareStatement("INSERT INTO minions_villains\n" +
                "VALUES (? , ?)");



        insertMinionsVillains.setInt(1, minionId);
        insertMinionsVillains.setInt(2, villainId);
        insertMinionsVillains.executeUpdate();

        System.out.printf("Successfully added %s to be minion of %s", minionName, villainName);
    }

    private static int getVillainId(Connection connection, String villainName) throws SQLException {
        PreparedStatement selectVillain = connection.prepareStatement("SELECT id FROM villains\n" +
                "WHERE name = ?;");
        selectVillain.setString(1, villainName);

        int villainId;

        ResultSet villainSet = selectVillain.executeQuery();

        if (!villainSet.next()) {
            insertVillain(connection, villainName);

            villainSet = selectVillain.executeQuery();
            villainSet.next();
            System.out.printf("Villain %s was added to the database.%n", villainName);
        }
        villainId = villainSet.getInt("id");

        return villainId;
    }

    private static void insertVillain(Connection connection, String villainName) throws SQLException {
        PreparedStatement insertVillain = connection.prepareStatement("INSERT INTO villains(name, evilness_factor)\n" +
                "VALUES (?, 'evil');");
        insertVillain.setString(1, villainName);
        insertVillain.executeUpdate();
    }

    private static int getTownId(Connection connection, String minionTown) throws SQLException {
        PreparedStatement selectTown = connection.prepareStatement("SELECT id FROM towns\n" +
                "WHERE `name` = ?;");

        selectTown.setString(1, minionTown);

        ResultSet townSet = selectTown.executeQuery();

        int townId;

        if (!townSet.next()) {
            insertTown(connection, minionTown);

            townSet = selectTown.executeQuery();
            townSet.next();
            System.out.printf("Town %s was added to the database.%n", minionTown);
        }
        townId = townSet.getInt("id");

        return townId;
    }

    private static void insertTown(Connection connection, String minionTown) throws SQLException {
        PreparedStatement insertTown = connection.prepareStatement("INSERT INTO towns(name)" +
                "VALUES (?);");
        insertTown.setString(1, minionTown);
        insertTown.executeUpdate();
    }
}
