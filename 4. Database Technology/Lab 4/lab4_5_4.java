import java.sql.*;

public class lab4_5_4
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

        String selectString = "SELECT S.sname " +
                "FROM Sailors S " +
                "WHERE NOT EXISTS (SELECT B.bid " +
                "FROM Boats B " +
                "WHERE NOT EXISTS (SELECT R.bid " +
                "FROM Reserves R " +
                "WHERE R.bid = B.bid AND " +
                "R.sid = S.sid))";
        rs = statement.executeQuery(selectString);

        System.out.println("sname");
        while(rs.next())
        {
            String sname = rs.getString("sname");
            
            System.out.println(sname);
        }

        statement.close();
        dbConnection.close();
    }
}