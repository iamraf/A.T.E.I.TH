import java.sql.*;

public class lab7_1
{
    private static String driverClassName = "org.apache.derby.jdbc.ClientDriver";
    private static String url = "jdbc:derby://localhost:1527/LUL";
    private static Connection dbConnection = null;
    private static String username = "it******";
    private static String passwd = "********";
    private static Statement statement = null;

    public static void main(String[] argv) throws Exception
    {
        Class.forName(driverClassName);
        dbConnection = DriverManager.getConnection(url, username, passwd);
        statement = dbConnection.createStatement();

        statement.executeUpdate("CREATE TABLE Sponsor (" +
                "kodikos int not null primary key," +
                "onoma varchar(20)," +
                "sxetikos varchar(20))");
        System.out.println("Sponsor created successfully");

        statement.executeUpdate("CREATE TABLE Sponsorship (" +
                "kodikos_sponsor int not null references sponsor(kodikos)," +
                "kodikos_athliti int, primary key(kodikos_sponsor, kodikos_athliti))");
        System.out.println("Sponsorship created successfully");

        statement.close();
        dbConnection.close();
    }
}