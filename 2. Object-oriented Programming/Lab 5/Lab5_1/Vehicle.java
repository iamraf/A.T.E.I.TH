class Vehicle
{
    private String idioktitis, arKykloforias;
    private int etosKat;
    private SystimaDieythynsis sysdief;
    private Mihani eng;

    Vehicle(int kyvismos, int ippodynami, int etosKat)
    {
        this.eng = new Mihani(kyvismos, ippodynami);
        this.sysdief = new SystimaDieythynsis();

        this.etosKat = etosKat;
    }

    public String getIdioktitis()
    {
        return idioktitis;
    }

    public int getKyvismos()
    {
        return eng.getKyvismos();
    }

    public int getIppodynami()
    {
        return eng.getIppodynami();
    }

    public void vazeiEmpros()
    {
        sysdief.vazeiEmpros();
        eng.leitourgia();
    }

    public void svynei()
    {
        sysdief.svynei();
        eng.svysimo();
    }

    public void striveiAristera()
    {
        sysdief.striveiAristera();
        eng.kinisi();
    }

    public void striveiDexia()
    {
        sysdief.striveiDexia();
        eng.kinisi();
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
}
