import java.sql.*;

public class lab6_1
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

        String selectString = "SELECT j.name, j.surname " +
                "FROM athlete a, participates p, games g, trainer t, judge j " +
                "WHERE a.code = p.athlete AND p.game = g.code AND t.code = a.trainer_code AND " +
                "j.code = g.judge AND p.cancellation = 'D' AND t.surname = 'Bartonietz'";

        ResultSet resultSet = statement.executeQuery(selectString);
        while(resultSet.next())
        {
            System.out.println("Name: " + resultSet.getString("name") + " Surname: " + resultSet.getString("surname"));
        }

        statement.close();
        dbConnection.close();
    }
}