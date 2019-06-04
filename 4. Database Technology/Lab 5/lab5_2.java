import java.sql.*;

public class lab5_2
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

        statement.executeUpdate("DROP TABLE RESERVES");
        statement.executeUpdate("DROP TABLE SAILORS");
        statement.executeUpdate("DROP TABLE BOATS");

        statement.close();
        dbConnection.close();
    }
}