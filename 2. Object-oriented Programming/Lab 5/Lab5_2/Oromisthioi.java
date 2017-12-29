class Oromisthioi extends Ypallilos
{
    private int ores;

    Oromisthioi(String onoma, String dieuthinsi, int AM, int ores)
    {
        super(onoma, dieuthinsi, AM);

        this.ores = ores;
    }

    public int getOres()
    {
        return ores;
    }

    public void setOres(int ores)
    {
        this.ores = ores;
    }

    public double amoivi()
    {
        double amoivi = 7 * ores + ((7 * ores) * 0.06);

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
