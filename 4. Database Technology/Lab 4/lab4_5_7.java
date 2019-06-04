import java.sql.*;

public class lab4_5_7
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

        String selectString = "select r.day1, count(*) as dcount from reserves r group by r.day1 ";
        rs = statement.executeQuery(selectString);

        System.out.println("day plithos");
        while(rs.next())
        {
            Date day1 = rs.getDate("day1");
            int dcount = rs.getInt("dcount");
            
            System.out.println(day1 + " " + dcount);
        }

        statement.close();
        dbConnection.close();
    }
}