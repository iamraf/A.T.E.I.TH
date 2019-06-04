import java.sql.*;

public class lab5_4
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

        statement.executeUpdate("insert into Sailors (sid, sname, rating, age) values (22, 'Dustin', 7, 45.0)");
        statement.executeUpdate("insert into Sailors (sid, sname, rating, age) values (29, 'Brutus', 1, 33.0)");
        statement.executeUpdate("insert into Sailors (sid, sname, rating, age) values (31, 'Lubber', 8, 55.5)");
        statement.executeUpdate("insert into Sailors (sid, sname, rating, age) values (32, 'Andy', 8, 25.5)");
        statement.executeUpdate("insert into Sailors (sid, sname, rating, age) values (58, 'Rusty', 10, 35.0)");
        statement.executeUpdate("insert into Sailors (sid, sname, rating, age) values (64, 'Horatio', 7, 35.0)");
        statement.executeUpdate("insert into Sailors (sid, sname, rating, age) values (71, 'Zorba', 10, 16.0)");
        statement.executeUpdate("insert into Sailors (sid, sname, rating, age) values (74, 'Horatio', 9, 40.0)");
        statement.executeUpdate("insert into Sailors (sid, sname, rating, age) values (85, 'Art', 3, 25.5)");
        statement.executeUpdate("insert into Sailors (sid, sname, rating, age) values (95, 'Bob', 3, 63.5)");

        statement.executeUpdate("insert into boats (bid, bname, color) values (101, 'Interlake', 'blue')");
        statement.executeUpdate("insert into boats (bid, bname, color) values (102, 'Interlake', 'red')");
        statement.executeUpdate("insert into boats (bid, bname, color) values (103, 'Clipper', 'green')");
        statement.executeUpdate("insert into boats (bid, bname, color) values  (104, 'Marine', 'red')");

        statement.executeUpdate("insert into reserves (sid, bid, day1) values (22, 101, date '2003-3-5')");
        statement.executeUpdate("insert into reserves (sid, bid, day1) values (31, 102, date '2003-3-5')");
        statement.executeUpdate("insert into reserves (sid, bid, day1) values (22, 103, date '2004-8-10')");
        statement.executeUpdate("insert into reserves (sid, bid, day1) values (22, 104, date '2005-7-12')");
        statement.executeUpdate("insert into reserves (sid, bid, day1) values (22, 102, date '2006-1-11')");
        statement.executeUpdate("insert into reserves (sid, bid, day1) values (31, 103, date '2007-6-13')");
        statement.executeUpdate("insert into reserves (sid, bid, day1) values (31, 104, date '2006-12-11')");
        statement.executeUpdate("insert into reserves (sid, bid, day1) values (64, 101, date '2008-5-9')");
        statement.executeUpdate("insert into reserves (sid, bid, day1) values (64, 102, date '2008-8-17')");
        statement.executeUpdate("insert into reserves (sid, bid, day1) values (74, 103, date '2001-8-29')");

        statement.close();
        dbConnection.close();
    }
}