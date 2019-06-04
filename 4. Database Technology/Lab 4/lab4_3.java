import java.sql.*;

public class lab4_3
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
        statement.executeUpdate("CREATE TABLE Sailors(" +
                "sid integer not null primary key," +
                "sname varchar(15)," +
                "rating integer," +
                "age integer)");

        statement.executeUpdate("CREATE TABLE Boats(" +
                "bid integer not null primary key," +
                "bname varchar(20)," +
                "color varchar(20) check(color in ('red', 'blue', 'green')))");

        statement.executeUpdate("CREATE TABLE Reserves(" +
                "sid integer not null," +
                "bid integer not null," +
                "day1 date not null," +
                "primary key(sid, bid, day1)," +
                "foreign key(sid) references Sailors," +
                "foreign key(bid) references Boats)");

        statement.close();
        dbConnection.close();
    }
}