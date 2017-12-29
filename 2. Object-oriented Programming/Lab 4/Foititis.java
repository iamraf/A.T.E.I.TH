class Foititis
{
    private String onoma;
    private String eponumo;
    private int am;
    private int etos;

    Foititis(String onoma, String eponumo)
    {
        this.onoma = onoma;
        this.eponumo = eponumo;
    }

    public String getOnoma()
    {
        return onoma;
    }

    public String getEponumo()
    {
        return eponumo;
    }

    public int getAm()
    {
        return am;
    }

    public int getEtos()
    {
        return etos;
    }

    public void setAM(int am)
    {
        this.am = am;
    }

    public void setEtos(int etos)
    {
        this.etos = etos;
    }
}
