class Pegasus extends Bird implements iHorse
{
    private int age, weight;

    Pegasus(int age, int weight)
    {
        this.age = age;
        this.weight = weight;
    }

    public void fly()
    {
        System.out.println("Pegasus fly high");
    }

    public void whinny()
    {
        System.out.println("Pegasus whinny");
    }

    public void gallop()
    {
        System.out.println("Pegasus travel fast");
    }
}
