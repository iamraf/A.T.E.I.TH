abstract class Vehicle
{
    private String idioktitis, arKykloforias;
    private int etosKat;

    Vehicle(int etosKat)
    {
        this.etosKat = etosKat;
    }

    public String getIdioktitis()
    {
        return idioktitis;
    }

    public String getArKykloforias()
    {
        return arKykloforias;
    }

    public int getEtosKat()
    {
        return etosKat;
    }

    public void setIdioktitis(String idioktitis)
    {
        this.idioktitis = idioktitis;
    }

    public void setArKykloforias(String arKykloforias)
    {
        this.arKykloforias = arKykloforias;
    }

    public void setEtosKat(int etosKat)
    {
        this.etosKat = etosKat;
    }

    public String toString()
    {
        String s = "Idioktitis: " + idioktitis;
        s += "\nAr. Kukloforias: " + arKykloforias;
        return s;
    }

    public void transferOwnership(String idioktitis)
    {
        this.idioktitis = idioktitis;
        System.out.println("Ownership transferred to " + idioktitis);
    }

    public abstract void drive();
}
