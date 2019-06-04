import java.sql.*;

public class lab4_2
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

        statement.executeUpdate("DROP TABLE Reserves");
        statement.executeUpdate("DROP TABLE Boats");
        statement.executeUpdate("DROP TABLE Sailors");

        statement.close();
        dbConnection.close();
    }
}