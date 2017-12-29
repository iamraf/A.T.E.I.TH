class Ypallilos
{
    private String name;
    private String birthDate;
    private int[] workingHours;
    private int[] overTime;
    private int dayWage;
    private int childNo;
    private int bonusFactor;

    Ypallilos(String name, String birthDate, int[] workingHours, int[] overTime, int dayWage, int childNo) throws IllegalArgumentException, InvalidBirthDateException
    {
        if(childNo < 0)
        {
            throw new IllegalArgumentException();
        }
        if((Integer.parseInt(birthDate.substring(0, 2)) < 1 || Integer.parseInt(birthDate.substring(0, 2)) > 31) || (Integer.parseInt(birthDate.substring(3, 5)) < 1 || Integer.parseInt(birthDate.substring(3, 5)) > 12))
        {
            throw new InvalidBirthDateException();
        }

        this.name = name;
        this.birthDate = birthDate;
        this.workingHours = workingHours;
        this.overTime = overTime;
        this.dayWage = dayWage;
        this.childNo = childNo;
    }

    public double ypologismosApodohon() throws InvalidHoursException
    {
        return ((emfanisiOronErgasias() + ypologismosYperorion()) * dayWage * (1 + ypologismosSintelestiEpidomatos()));
    }

    public double ypologismosSintelestiEpidomatos() throws ArithmeticException
    {
        double bonus;

        try
        {
            if(childNo == 0)
            {
                throw new ArithmeticException();
            }

            bonus = (100 - (50 / childNo));
        }
        catch(ArithmeticException e)
        {
            bonus = 0;
        }

        return bonus;
    }

    public double ypologismosYperorion() throws InvalidHoursException
    {
        int uperories = 0;

        try
        {
            for(int i = 0; i < overTime.length; i++)
            {
                uperories += overTime[i];
            }

            if(uperories < 0)
            {
                throw new InvalidHoursException("Mikrotero tou 0");
            }
            if(uperories > 120)
            {
                throw new InvalidHoursException();
            }
        }
        catch(InvalidHoursException e)
        {
            System.out.println("Too many hours...");
        }
        finally
        {
            System.out.println("End of calculation");
        }

        return uperories;
    }

    public double emfanisiOronErgasias() throws ArrayIndexOutOfBoundsException
    {
        int ores = 0;

        try
        {
            for(int i = 0; i < workingHours.length; i++)
            {
                ores += workingHours[i];
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Ektos orion");
        }

        return ores;
    }

    public void emfanisiYpalilou()
    {
        System.out.println("Onoma: " + name);
        System.out.println("Imerominia Genisis: " + birthDate);
        System.out.println("Ores Ergasias: " + workingHours);
        System.out.println("Iperories: " + overTime);
        System.out.println("Imeromisthio: " + dayWage);
        System.out.println("Plithos teknon: " + childNo);
        System.out.println("Sintelestis Epidomatos: " + bonusFactor);
    }
}
