class Student
{
    private int am, apousies;
    private String onoma, epitheto;
    private double vathmos;

    public Student(int am, String onoma, String epitheto, int apousies, double vathmos)
    {
        this.am = am;
        this.onoma = onoma;
        this.epitheto = epitheto;
        this.apousies = apousies;
        this.vathmos = vathmos;
    }

    public void setAM(int am)
    {
        this.am = am;
    }

    public void setOnoma(String onoma)
    {
        this.onoma = onoma;
    }

    public void setEpitheto(String epitheto)
    {
        this.epitheto = epitheto;
    }

    public void setApousies(int apousies)
    {
        this.apousies = apousies;
    }

    public void setVathmos(double vathmos)
    {
        this.vathmos = vathmos;
    }

    public int getAM()
    {
        return am;
    }

    public String getOnoma()
    {
        return onoma;
    }

    public String getEpitheto()
    {
        return epitheto;
    }

    public int getApousies()
    {
        return apousies;
    }

    public double getVathmos()
    {
        return vathmos;
    }

    public String toString()
    {
        return "\n------\nAM: " + am + "\nOnoma: " + onoma + "\nEpitheto: " + epitheto + "\nApousies: " + apousies + "\nVathmos: " + vathmos + "\n------\n";
    }
}
