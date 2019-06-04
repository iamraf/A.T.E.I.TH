import java.sql.*;

public class lab4_5_6
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

        String selectString = "select avg(S.rating) as avgrating from sailors s where s.age < 45 ";
        rs = statement.executeQuery(selectString);

        System.out.println("M.O. rating");
        while(rs.next())
        {
            float avgrating = rs.getFloat("avgrating");
            
            System.out.println(avgrating);
        }

        statement.close();
        dbConnection.close();
    }
}