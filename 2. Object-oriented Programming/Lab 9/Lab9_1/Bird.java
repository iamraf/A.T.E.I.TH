class Bird
{
    private int age, weight;

    Bird()
    {

    }

    Bird(int age, int weight)
    {
        this.age = age;
        this.weight = weight;
    }

    public void chirp()
    {
        System.out.println("Bird chirp...");
    }

    public void fly()
    {
        System.out.println("Bird fly high");
    }
}
