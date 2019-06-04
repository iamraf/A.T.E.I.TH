import java.sql.*;

public class lab5_5
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

        ResultSet resultSet = statement.executeQuery("SELECT sname, age FROM SAILORS");

        System.out.println("5.1");
        while(resultSet.next())
        {
            System.out.println("Name: " + resultSet.getString("sname") + " Age: " + resultSet.getInt("age"));
        }

        ResultSet resultSet2 = statement.executeQuery("SELECT s.sname FROM SAILORS s JOIN RESERVES r ON (s.sid = r.sid) WHERE r.bid = 103");

        System.out.println("\n5.2");
        while(resultSet2.next())
        {
            System.out.println("Name: " + resultSet2.getString("sname"));
        }

        ResultSet resultSet3 = statement.executeQuery("SELECT s.sname FROM SAILORS s WHERE s.rating > (SELECT MAX(s1.rating) FROM SAILORS s1 WHERE s1.sname = 'Horatio')");

        System.out.println("\n5.3");
        while(resultSet3.next())
        {
            System.out.println("Name: " + resultSet3.getString("sname"));
        }

        ResultSet resultSet4 = statement.executeQuery("SELECT s.sname FROM SAILORS s WHERE NOT EXISTS (SELECT * FROM BOATS b WHERE NOT EXISTS (SELECT * FROM RESERVES r WHERE r.sid = s.sid AND r.bid = b.bid))");

        System.out.println("\n5.4");
        while(resultSet4.next())
        {
            System.out.println("Name: " + resultSet4.getString("sname"));
        }

        ResultSet resultSet5 = statement.executeQuery("SELECT rating, AVG(age) as kappa FROM SAILORS GROUP BY RATING");

        System.out.println("\n5.5");
        while(resultSet5.next())
        {
            System.out.println("Rating: " + resultSet5.getString("rating") + " Average: " + resultSet5.getString("kappa"));
        }

        ResultSet resultSet6 = statement.executeQuery("SELECT AVG(age) as kappa FROM SAILORS WHERE rating < 45");

        System.out.println("\n5.6");
        while(resultSet6.next())
        {
            System.out.println("Rating Average: " + resultSet6.getString("kappa"));
        }

        ResultSet resultSet7 = statement.executeQuery("");

        System.out.println("\n5.7");
        while(resultSet7.next())
        {
            System.out.println("Rating Average: " + resultSet7.getString("kappa"));
        }

        ResultSet resultSet8 = statement.executeQuery("");

        System.out.println("\n5.8");
        while(resultSet8.next())
        {
            System.out.println("Rating Average: " + resultSet8.getString("kappa"));
        }

        statement.close();
        dbConnection.close();
    }
}