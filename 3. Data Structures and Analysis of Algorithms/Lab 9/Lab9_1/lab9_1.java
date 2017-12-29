//http://aetos.it.teithe.gr/~demos/Downloads/DS_LAB9.pdf

import java.io.*;

class lab9_1
{
    public static void main(String[] args)
    {
        //a

        int[] input = {1, 2, 3, 4, 5};

        try
        {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("lab9_1a.txt"));

            for(int i = 0; i < input.length; i++)
            {
                out.writeInt(input[i]);
            }

            out.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

        //

        int[] input2 = {5, 6, 7, 8, 9};

        try
        {
            DataOutputStream out2 = new DataOutputStream(new FileOutputStream("lab9_1b.txt"));

            for(int i = 0; i < input2.length; i++)
            {
                out2.writeInt(input2[i]);
            }

            out2.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }


        //b

        try
        {
            DataInputStream inA = new DataInputStream(new FileInputStream("lab9_1a.txt"));
            DataInputStream inB = new DataInputStream(new FileInputStream("lab9_1b.txt"));
            DataOutputStream outC = new DataOutputStream(new FileOutputStream("final.txt"));

            try
            {
                while(true)
                {
                    outC.writeInt(inA.readInt());
                }
            }
            catch(EOFException e)
            {
                inA.close();
            }

            try
            {
                while(true)
                {
                    outC.writeInt(inB.readInt());
                }
            }
            catch(EOFException e)
            {
                inB.close();
            }

            outC.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

        //c

        try
        {
            DataInputStream finalOut = new DataInputStream(new FileInputStream("final.txt"));

            try
            {
                while(true)
                {
                    System.out.println(finalOut.readInt());
                }
            }
            catch(EOFException e)
            {
                finalOut.close();
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
