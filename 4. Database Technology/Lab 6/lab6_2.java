import java.sql.*;

public class lab6_2
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

        String selectString = "SELECT a.name, a.surname, s.name as sportname " +
                "FROM athlete a, sport s, participates p, games g " +
                "WHERE a.code = p.athlete AND p.game = g.code AND " +
                "g.sport = s.code AND g.glevel = 'Final'";

        ResultSet resultSet = statement.executeQuery(selectString);
        while(resultSet.next())
        {
            System.out.println("Name: " + resultSet.getString("name") + " Surname: " + resultSet.getString("surname") + " SportName: " + resultSet.getString("sportname"));
        }

        statement.close();
        dbConnection.close();
    }
}