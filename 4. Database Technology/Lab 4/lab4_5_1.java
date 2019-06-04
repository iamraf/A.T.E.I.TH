import java.sql.*;

public class lab4_5_1
{
    private static String driverClassName = "oracle.jdbc.OracleDriver";
    private static String url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs";
    private static Connection dbConnection = null;
    private static String username = "it******";
    private static String passwd = "********";
    private static Statement statement = null;
    private static ResultSet rs = null;

    public static void main(String[] argv) throws Exception
    {
        Class.forName(driverClassName);
        dbConnection = DriverManager.getConnection(url, username, passwd);
        statement = dbConnection.createStatement();

        String selectString = "select S.sname, age From Sailors S ";
        rs = statement.executeQuery(selectString);

        System.out.println("sname age");
        while(rs.next())
        {
            String name = rs.getString("sname");
            float vage = rs.getFloat("age");
            
            System.out.println(name + " " + vage);
        }

        statement.close();
        dbConnection.close();
    }
}