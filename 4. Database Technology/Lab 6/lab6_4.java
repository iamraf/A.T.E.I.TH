import java.sql.*;

public class lab6_4
{
    private static String driverClassName = "oracle.jdbc.OracleDriver";
    private static String url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs";
    private static Connection dbConnection = null;
    private static String username = "it******";
    private static String passwd = "********";
    private static Statement statement = null;

    public static void main(String[] argv) throws Exception
    {
        Class.forName(driverClassName);
        dbConnection = DriverManager.getConnection(url, username, passwd);

        statement = dbConnection.createStatement();

        String selectString = "SELECT a.name, a.surname " +
                "FROM athlete a, participates p, sport s, games g " +
                "WHERE a.code = p.athlete AND p.game = g.code AND g.sport = a.code AND s.gender = 'Male' AND g.glevel = 'Final' " +
                "AND s.name = '100m' AND p.performance = (SELECT min(p2.performance) FROM participates p2, sport s2, games g2 " +
                "WHERE g2.code = p2.athlete AND p2.game = s2.code AND s2.gender = 'Male' AND g2.glevel = 'Final' AND s2.name = '100m')";

        ResultSet resultSet = statement.executeQuery(selectString);
        while(resultSet.next())
        {
            System.out.println("Name: " + resultSet.getString("name") + " Surname: " + resultSet.getString("surname"));
        }

        statement.close();
        dbConnection.close();
    }
}