import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class lab7_2
{
    private static String driverClassName = "org.apache.derby.jdbc.ClientDriver";
    private static String url = "jdbc:derby://localhost:1527/LUL";
    private static Connection dbConnection = null;
    private static String username = "it******";
    private static String passwd = "********";
    private static PreparedStatement statement = null;

    public static void main(String[] argv) throws Exception
    {
        Class.forName(driverClassName);
        dbConnection = DriverManager.getConnection(url, username, passwd);

        statement = dbConnection.prepareStatement("INSERT INTO SPONSOR VALUES (?, ?, ?)");

        int par1 = 0;
        String par2;
        String par3;

        System.out.println("Insert sponsor values you little bitch: ");

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        while(par1 != 999)
        {
            System.out.print("\n\nEnter sponsor code: ");
            par1 = Integer.parseInt(buff.readLine());

            if(par1 != 999)
            {
                System.out.print("\nEnter onoma: ");
                par2 = buff.readLine();

                System.out.print("\nEnter sxetikos: ");
                par3 = buff.readLine();

                statement.setInt(1, par1);
                statement.setString(2, par2);
                statement.setString(3, par3);
                statement.executeUpdate();
            }
        }

        statement = dbConnection.prepareStatement("INSERT INTO SPONSOR VALUES (?, ?)");

        int arg1;
        int arg2;

        System.out.println("Insert sponsorship values: ");

        while(arg1 != 999)
        {
            System.out.print("\n\nEnter sponsor code: ");
            arg1 = Integer.parseInt(buff.readLine());

            if(arg1 != 999)
            {
                System.out.print("\nEnter kodikos athiliti: ");
                arg2 = Integer.parseInt(buff.readLine());

                statement.setInt(1, arg1);
                statement.setInt(2, arg2);
                statement.executeUpdate();
            }
        }

        /*statement.executeUpdate("insert INTO Sponsor (kodikos, onoma, sxetikos) VALUES (1, 'puma', 'clothing')");
        statement.executeUpdate("insert INTO Sponsor (kodikos, onoma, sxetikos) VALUES (2, 'ferrari', 'cars')");
        statement.executeUpdate("insert INTO Sponsor (kodikos, onoma, sxetikos) VALUES (3, 'microsoft', 'pc')");

        statement.executeUpdate("insert INTO Sponsorship (kodikos_sponsor, kodikos_athliti) VALUES (1, 17)");
        statement.executeUpdate("insert INTO Sponsorship (kodikos_sponsor, kodikos_athliti) VALUES (2, 10)");
        statement.executeUpdate("insert INTO Sponsorship (kodikos_sponsor, kodikos_athliti) VALUES (3, 77)");*/

        statement.close();
        dbConnection.close();
    }
}