class Fotografia implements ProsPolisi
{
    private String perigrafi;
    private double timi;
    private boolean exromi;

    Fotografia(String perigrafi, double timi, boolean exromi)
    {
        this.perigrafi = perigrafi;
        this.timi = timi;
        this.exromi = exromi;
    }

    public String getPerigrafi()
    {
        return perigrafi;
    }

    public void setPerigrafi(String perigrafi)
    {
        this.perigrafi = perigrafi;
    }

    public double getTimi()
    {
        return timi;
    }

    public void setTimi(double timi)
    {
        this.timi = timi;
    }

    public boolean isExromi()
    {
        return exromi;
    }

    public void setExromi(boolean exromi)
    {
        this.exromi = exromi;
    }

    public double getApodektiTimi(double pososto)
    {
        return (pososto * timi) / 100;
    }
}
