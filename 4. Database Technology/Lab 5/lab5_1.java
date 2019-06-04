import java.sql.*;

public class lab5_1
{
    private static String driverClassName = "oracle.jdbc.OracleDriver";
    private static String url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs";
    private static Connection dbConnection = null;
    private static String username = "it******";
    private static String passwd = "********";

    public static void main (String[] argv) throws Exception
    {
        Class.forName(driverClassName);
        dbConnection = DriverManager.getConnection(url, username, passwd);
        dbConnection.close();
    }
}