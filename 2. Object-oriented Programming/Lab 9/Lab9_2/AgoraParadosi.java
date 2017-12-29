class AgoraParadosi implements Asfalismeno
{
    private String perigrafi;
    private double timi, baros;
    public boolean euthrasto;
    private double posoAsfalisis;
    public double X, Y, Z;

    AgoraParadosi(String perigrafi, double timi, double baros, boolean euthrasto, double posoAsfalisis, double X, double Y, double Z)
    {
        this.perigrafi = perigrafi;
        this.timi = timi;
        this.baros = baros;
        this.euthrasto = euthrasto;
        this.posoAsfalisis = posoAsfalisis;
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    public String getPerigrafi()
    {
        return perigrafi;
    }

    public double getTimi()
    {
        return timi;
    }

    public double getBaros()
    {
        return baros;
    }

    public boolean isEuthrausto()
    {
        return euthrasto;
    }

    public double getPosoAsfalisis()
    {
        return posoAsfalisis;
    }

    public double getX()
    {
        return X;
    }

    public double getY()
    {
        return Y;
    }

    public double getZ()
    {
        return Z;
    }

    public double getApodektiTimi(double pososto)
    {
        return (pososto * timi) / 100;
    }
}
