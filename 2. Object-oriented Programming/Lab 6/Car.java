class Car extends Vehicle
{
    private int doors;

    Car(String idioktitis, String arKykloforias, int etosKat, int doors)
    {
        super(etosKat);
        super.setIdioktitis(idioktitis);
        super.setArKykloforias(arKykloforias);

        this.doors = doors;
    }

    public int getDoors()
    {
        return doors;
    }

    public void drive()
    {
        System.out.println("You need a car driving license dear " + getIdioktitis());
    }
}
