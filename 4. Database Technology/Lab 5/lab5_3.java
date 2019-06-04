import java.sql.*;

public class lab5_3
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

        statement.executeUpdate("create table Sailors (sid integer not null,sname varchar(15), rating integer, age real, primary key(sid))");
        statement.executeUpdate("create table boats (bid integer not null, bname varchar(20), color varchar(20), primary key(bid), constraint b_color check (color in ( 'red', 'green', 'blue', 'yellow')) )");
        statement.executeUpdate("create table Reserves (sid integer not null, bid integer not null, day1 date not null, primary key (sid, bid, day1), constraint r_sid foreign key(sid) references Sailors, constraint r_bid foreign key(bid) references boats)");

        statement.close();
        dbConnection.close();
    }
}