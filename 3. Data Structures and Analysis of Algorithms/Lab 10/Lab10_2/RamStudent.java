class RamStudent extends Student
{
    public RamStudent()
    {
        this(0, "", "", 0, 0.0);
    }

    public RamStudent(int am, String onoma, String epitheto, int apousies, double vathmos)
    {
        super(am, onoma, epitheto, apousies, vathmos);
    }

    public RamStudent read(RandomAccessFile file) throws IOException
    {
        setAM(file.readInt());
        setOnoma(cutName(file));
        setEpitheto(cutName(file));
        setApousies(file.readInt());
        setVathmos(file.readDouble());
        return this;
    }

    private String cutName(RandomAccessFile file) throws IOException
    {
        char[] name = new char[15];

        for(int i = 0; i < name.length; i++)
        {
            name[i] = file.readChar();
        }

        return new String(name).replace('\0', ' ');
    }

    public void write(RandomAccessFile file) throws IOException
    {
        file.writeInt(getAM());
        putName(file, getOnoma());
        putName(file, getEpitheto());
        file.writeInt(getApousies());
        file.writeDouble(getVathmos());
    }

    private void putName(RandomAccessFile file, String name) throws IOException
    {
        StringBuffer buf = null;

        if(name != null)
        {
            buf = new StringBuffer(name);
        }
        else
        {
            buf = new StringBuffer(15);
        }

        buf.setLength(15);

        file.writeChars(buf.toString());
    }

    public static int size()
    {
        return 76;
    }
}
