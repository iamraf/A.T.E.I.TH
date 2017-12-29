abstract class Tilefono
{
    private String phoneNumber;
    public double[] callCosts = {0.05 /*Stathero-Stathero*/, 0.07/*Stathero-Kinito*/, 0.08/*Kinito-Stathero*/, 0.10/*Kinito-Kinito*/};

    Tilefono()
    {

    }

    Tilefono(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public abstract void dial(String firstNumber, String secondNumber);
    public abstract double cost(int duration, int type);
    public abstract int getSecondsToKinita();
    public abstract int getSecondsToStathera();
    public abstract double getCostToKinita();
    public abstract double getCostToStathera();
}
