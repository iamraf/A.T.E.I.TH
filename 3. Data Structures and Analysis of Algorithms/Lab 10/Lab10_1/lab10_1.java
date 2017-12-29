//https://aetos.it.teithe.gr/~demos/Downloads/DS_LAB10.pdf

import java.io.*;

class lab10_1
{
    public static void main(String[] args)
    {
        RamStudent students = new RamStudent();

        try
        {
            RandomAccessFile file = new RandomAccessFile("lab10_1.dat", "rw");

            for(int i = 0; i < 20; i++)
            {
                new RamStudent(12001 + i, "", "").write(file);
            }

            file.seek(hash(12003));

            RamStudent test = students.read(file);
            System.out.println("AM: " + test.getAM());
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
    }

    public static int hash(int x)
    {
        return 64 * (x - 12001);
    }
}
