class Motorcycle extends Vehicle
{
    private boolean carrys;

    Motorcycle(String idioktitis, String arKykloforias, int etosKat, boolean carrys)
    {
        super(etosKat);
        super.setIdioktitis(idioktitis);
        super.setArKykloforias(arKykloforias);

        this.carrys = carrys;
    }

    public boolean isCarrying()
    {
        return carrys;
    }

    public void drive()
    {
        System.out.println("Your car driving license is not enough. You need a special license dear " + getIdioktitis());
    }
}
