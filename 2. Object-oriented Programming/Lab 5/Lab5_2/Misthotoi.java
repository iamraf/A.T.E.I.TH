class Misthotoi extends Ypallilos
{
    private int tekna, etoi;

    Misthotoi(String onoma, String dieuthinsi, int AM, int tekna, int etoi)
    {
        super(onoma, dieuthinsi, AM);

        this.tekna = tekna;
        this.etoi = etoi;
    }

    public int getTekna()
    {
        return tekna;
    }

    public void setTekna(int tekna)
    {
        this.tekna = tekna;
    }

    public int getEtoi()
    {
        return etoi;
    }

    public void setEtoi(int etoi)
    {
        this.etoi = etoi;
    }

    public double amoivi()
    {
        double amoivi = 700 + (tekna * (700 * 0.05));

        return amoivi;
    }

    public String toString()
    {
        String s = "Onoma = " + getOnoma();
        s += "\nDieuthinsi = " + getDieuthinsi();
        s += "\nAr.Mitroou = " + getAM();
        s += "\nAmoivi = " + amoivi();

        return s;
    }
}
