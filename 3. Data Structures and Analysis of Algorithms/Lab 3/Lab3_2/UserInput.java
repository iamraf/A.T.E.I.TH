import java.io.*;

class UserInput
{
    public static int getInteger()
    {
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            line = br.readLine();
            int i = Integer.parseInt(line);

            return i;
        }
        catch(Exception e)
        {
            return -1;
        }
    }

    public static float getFloat()
    {
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            line = br.readLine();
            float i = Float.parseFloat(line);

            return i;
        }
        catch(Exception e)
        {
            return -1;
        }
    }

    public static double getDouble()
    {
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            line = br.readLine();
            double i = Double.parseDouble(line);

            return i;
        }
        catch(Exception e)
        {
            return -1;
        }
    }

    public static short getShort()
    {
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            line = br.readLine();
            short i = Short.parseShort(line);

            return i;
        }
        catch(Exception e)
        {
            return -1;
        }
    }

    public static long getLong()
    {
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            line = br.readLine();
            long i = Long.parseLong(line);

            return i;
        }
        catch(Exception e)
        {
            return -1;
        }
    }

    public static long getByte()
    {
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            line = br.readLine();
            byte i = Byte.parseByte(line);

            return i;
        }
        catch(Exception e)
        {
            return -1;
        }
    }

    //

    public static char getChar()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            char c = (char) br.read();

            return c;
        }
        catch(Exception e)
        {
            return 0;
        }
    }

    public static String getString()
    {
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            line = br.readLine();
            return line;
        }
        catch(Exception e)
        {
            return "Error";
        }
    }
}
