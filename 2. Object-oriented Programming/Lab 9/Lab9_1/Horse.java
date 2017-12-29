class Horse implements iHorse
{
    private int age, weight;

    Horse(int age, int weight)
    {
        this.age = age;
        this.weight = weight;
    }

    public void whinny()
    {
        System.out.println("Horse whinny");
    }

    public void gallop()
    {
        System.out.println("Horse travel fast");
    }
}
