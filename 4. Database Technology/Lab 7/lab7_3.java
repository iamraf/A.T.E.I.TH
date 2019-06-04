import java.sql.*;

public class lab7_3
{
    private static String driverClassName = "oracle.jdbc.OracleDriver";
    private static String url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs";
    private static Connection dbConnection = null;
    private static String username = "it******";
    private static String passwd = "********";
    private static Statement statement = null;

    private static String jdriverClassName = "org.apache.derby.jdbc.ClientDriver";
    private static String jurl = "jdbc:derby://localhost:1527/LUL";
    private static Connection jdbConnection = null;
    private static String jusername = "it******";
    private static String jpasswd = "********";
    private static Statement jstatement = null;

    public static void main(String[] argv) throws Exception
    {
        Class.forName(driverClassName);
        dbConnection = DriverManager.getConnection(url, username, passwd);
        statement = dbConnection.createStatement();

        Class.forName(jdriverClassName);
        jdbConnection = DriverManager.getConnection(jurl, jusername, jpasswd);
        jstatement = jdbConnection.createStatement();

        String OselectString = "SELECT a.code, a.surname " +
                "FROM athlete a, participates p, games g, sport s " +
                "WHERE a.code = p.athlete AND p.game = g.code AND g.sport = s.code AND " +
                "s.gender = 'Male' AND g.glevel = 'Final' AND s.name = '100m' AND " +
                "p.performance = (SELECT min(p2.performance) " +
                "FROM participates p2, sport s2, games g2 " +
                "WHERE g2.code = p2.game AND g2.sport = s2.code AND " +
                "s.gender = 'Male' AND " +
                "g2.glevel = 'Final' AND s2.name = '100m')";

        ResultSet resultSet = statement.executeQuery(OselectString);
        while(resultSet.next())
        {
            String code = resultSet.getString("code");
            String surname = resultSet.getString("surname");

            System.out.println("Code: " + code + " Surname: " + surname);

            String select = "SELECT s1.onoma, s1.sxetikos FROM Sponsor s1, Sponsorship s2 WHERE s1.kodikos = s2.kodikos_sponsor AND s2.kodikos_athliti = " + code;

            ResultSet resultSet2 = jstatement.executeQuery(select);
            while(resultSet2.next())
            {
                String onoma = resultSet2.getString("onoma");
                String sxetiko = resultSet2.getString("sxetikos");

                System.out.println("Onoma: " + onoma + " Sxetiko: " + sxetiko);
            }
        }

        statement.close();
        dbConnection.close();

        jstatement.close();
        jdbConnection.close();
    }
}