class Student
{
    private int am;
    private String onoma, epitheto;

    public Student(int am, String onoma, String epitheto)
    {
        this.am = am;
        this.onoma = onoma;
        this.epitheto = epitheto;
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
}
