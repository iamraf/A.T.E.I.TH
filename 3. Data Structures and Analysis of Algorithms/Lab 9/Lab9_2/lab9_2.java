//http://aetos.it.teithe.gr/~demos/Downloads/DS_LAB9.pdf

import java.io.*;

class lab9_2
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader input = new BufferedReader(new FileReader("lab9_2.txt"));

            BufferedWriter outputYes = new BufferedWriter(new FileWriter("lab9_2_yes.txt"));
            BufferedWriter outputNo = new BufferedWriter(new FileWriter("lab9_2_no.txt"));

            String name = "";
            String line = "";

            while((line = input.readLine()) != null)
            {
                if(line.equals("NAI"))
                {
                    outputYes.write(name);
                    outputYes.newLine();
                }
                else
                {
                    if(line.equals("OXI"))
                    {
                        outputNo.write(name);
                        outputNo.newLine();
                    }
                    else
                    {
                        name = line;
                    }
                }
            }

            input.close();
            outputYes.close();
            outputNo.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
