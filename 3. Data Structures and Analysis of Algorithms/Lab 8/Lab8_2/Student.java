class Student implements Comparable
{
    private int AM;
    private String name;

    Student(int AM, String name)
    {
        this.AM = AM;
        this.name = name;
    }

    public int getAM()
    {
        return AM;
    }

    public String getName()
    {
        return name;
    }

    public int compareTo(Object S)
    {
        if(AM < ((Student) S).getAM())
        {
            return -1;
        }
        else
        {
            if(AM > ((Student) S).getAM())
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
}
