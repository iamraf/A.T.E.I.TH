class Lab
{
    Student[] labs = new Student[3];

    public void insert(Student student)
    {
        for(int i = 0; i < labs.length; i++)
        {
            if(labs[i] == null)
            {
                labs[i] = student;
                break;
            }
        }
    }

    public void delete(int AM)
    {
        for(int i = 0; i < labs.length; i++)
        {
            if(labs[i].getAM() == AM)
            {
                labs[i] = null;
                break;
            }
        }
    }

    public int search(int AM)
    {
        for(int i = 0; i < labs.length; i++)
        {
            if(labs[i].getAM() == AM)
            {
                return i;
            }
        }

        return -1;
    }

    public void printall()
    {
        String string = "";

        for(int i = 0; i < labs.length; i++)
        {
            string += "\nAM: " + labs[i].getAM() + "\nEpitheto: " + labs[i].getLastname() + "\nOnoma: " + labs[i].getName() + "\nApousies: " + labs[i].getApousies() + "\nVathmos: " + labs[i].getVathmos() + " \n";
        }

        System.out.println(string);
    }

    public int findSuccess()
    {
        int count = 0;

        for(int i = 0; i < labs.length; i++)
        {
            if(labs[i].getVathmos() >= 5.0)
            {
                count++;
            }
        }

        return count;
    }

    public int findFail()
    {
        int count = 0;

        for(int i = 0; i < labs.length; i++)
        {
            if(labs[i].getVathmos() < 5)
            {
                count++;
            }
        }

        return count;
    }

    public double findMO()
    {
        double MO = 0;

        for(int i = 0; i < labs.length; i++)
        {
            MO += labs[i].getVathmos();
        }

        return MO / labs.length;
    }
}
