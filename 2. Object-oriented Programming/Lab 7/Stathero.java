class Stathero extends Tilefono
{
    private int secondsToKinita;
    private int secondsToStathera;
    private double costToKinita;
    private double costToStathera;

    Stathero(int secondsToKinita, int secondsToStathera, double costToKinita, double costToStathera)
    {
        this.secondsToKinita = secondsToKinita;
        this.secondsToStathera = secondsToStathera;
        this.costToKinita = costToKinita;
        this.costToStathera = costToStathera;
    }

    Stathero(String phoneNumber, int secondsToKinita, int secondsToStathera, double costToKinita, double costToStathera)
    {
        super(phoneNumber);

        this.secondsToKinita = secondsToKinita;
        this.secondsToStathera = secondsToStathera;
        this.costToKinita = costToKinita;
        this.costToStathera = costToStathera;
    }

    @Override
    public int getSecondsToKinita()
    {
        return secondsToKinita;
    }

    @Override
    public int getSecondsToStathera()
    {
        return secondsToStathera;
    }

    @Override
    public double getCostToKinita()
    {
        return costToKinita;
    }

    @Override
    public double getCostToStathera()
    {
        return costToStathera;
    }

    @Override
    public void dial(String firstNumber, String secondNumber)
    {
        int temp = Character.getNumericValue(secondNumber.charAt(0));
        int randomCost = (int) (Math.random() * 1000);

        System.out.println("Klhsh apo to Stathero thlefono " + firstNumber + " pros to " + (temp == 6 ? "Kinito" : "Stathero") + " me arithmo " + secondNumber);

        cost(randomCost, (temp == 6 ? 0 : 1));
    }

    @Override
    public double cost(int duration, int type /* 0 for Kinito, 1 for Stathero*/)
    {
        double newCost;

        if(type == 0)
        {
            secondsToKinita += duration;
            costToKinita += duration * callCosts[3];

            newCost = costToKinita;
        }
        else
        {
            secondsToStathera += duration;
            costToStathera += duration * callCosts[2];

            newCost = costToStathera;
        }

        return newCost;
    }
}
