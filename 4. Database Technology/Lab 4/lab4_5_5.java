import java.sql.*;

public class lab4_5_5
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

        String selectString = "select S.rating, avg(s.age) as mo from sailors s group by s.rating";
        rs = statement.executeQuery(selectString);

        System.out.println("rating M.O age");
        while(rs.next())
        {
            int rating = rs.getInt("rating");
            float mage = rs.getFloat("mo");

            System.out.println(rating + " " + mage);
        }

        statement.close();
        dbConnection.close();
    }
}