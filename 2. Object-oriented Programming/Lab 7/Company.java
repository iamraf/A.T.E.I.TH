class Company
{
    Tilefono[] pinakas = new Tilefono[5];

    public void setTilefono(Tilefono obj, int id)int kyvismos, int ippodynami,
    {
        pinakas[id] = obj;
    }

    public void randomCalls()
    {
        int randomNumber = (int) (Math.random() * 10000);

        if(randomNumber < 1000)
        {
            randomNumber += 1000;
        }

        for(int i = 0; i < randomNumber; i++)
        {
            int firstNumber = (int) (Math.random() * 5);
            int secondNumber = (int) (Math.random() * 5);

            pinakas[firstNumber].dial(pinakas[firstNumber].getPhoneNumber(), pinakas[secondNumber].getPhoneNumber());
        }
    }

    public void printAll()
    {
        for(int i = 0; i < pinakas.length; i++)
        {
            System.out.println("Arithmos: " + pinakas[i].getPhoneNumber() + " Eksoda: " + (pinakas[i].getCostToKinita() + pinakas[i].getCostToStathera()));
        }
    }

    public void calculateStatheraCosts()
    {
        double total = 0;

        for(int i = 0; i < pinakas.length; i++)
        {
            total += pinakas[i].getCostToStathera();
        }

        System.out.println("Sunoloko kostos klhseon statheron: " + total);
    }

    public void calculateKinitaCosts()
    {
        double total = 0;

        for(int i = 0; i < pinakas.length; i++)
        {
            total += pinakas[i].getCostToKinita();
        }

        System.out.println("Sunoloko kostos klhseon kiniton: " + total);
    }

    public void calculateStatheraSeconds()
    {
        int total = 0;

        for(int i = 0; i < pinakas.length; i++)
        {
            total += pinakas[i].getSecondsToStathera();
        }

        System.out.println("Sunoloka defterolepta klhseon statheron: " + total);
    }

    public void calculateKinitaSeconds()
    {
        int total = 0;

        for(int i = 0; i < pinakas.length; i++)
        {
            total += pinakas[i].getSecondsToKinita();
        }

        System.out.println("Sunoloka defterolepta klhseon kiniton: " + total);
    }

    public void calculateAllCosts()
    {
        double total = 0;

        for(int i = 0; i < pinakas.length; i++)
        {
            total += pinakas[i].getCostToKinita() + pinakas[i].getCostToStathera();
        }

        System.out.println("Sunoloko kostos klhseon: " + total);
    }
}
