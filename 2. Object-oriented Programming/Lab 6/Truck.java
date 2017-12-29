class Truck extends Vehicle
{
    private int axels;

    Truck(String idioktitis, String arKykloforias, int etosKat, int axels)
    {
        super(etosKat);
        super.setIdioktitis(idioktitis);
        super.setArKykloforias(arKykloforias);

        this.axels = axels;
    }

    public int getAxels()
    {
        return axels;
    }

    public void drive()
    {
        System.out.println("You must be a professional driver. This is a " + axels + " axels truck Mr. " + getIdioktitis());
    }
}
