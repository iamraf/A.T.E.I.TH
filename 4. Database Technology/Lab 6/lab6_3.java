import java.sql.*;

public class lab6_3
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

        String selectString = "SELECT COUNT(DISTINCT p.athlete) as lul " +
                "FROM participates p, games g, stadium s " +
                "WHERE s.name = g.stadium AND p.game = g.code " +
                "GROUP BY s.name HAVING s.name = 'Olympic Stadium'";

        ResultSet resultSet = statement.executeQuery(selectString);
        while(resultSet.next())
        {
            System.out.println("Athletes: " + resultSet.getString("lul"));
        }

        statement.close();
        dbConnection.close();
    }
}