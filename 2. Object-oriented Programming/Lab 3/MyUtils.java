class MyUtils
{
    public static void insertSort(Foititis pinakas[])
    {
        for(int i = 1; i < pinakas.length; i++)
        {
            int current = pinakas[i].getAm();
            int pos = i;

            Foititis temp = pinakas[i];

            while(pos > 0 && pinakas[pos - 1].getAm() > current)
            {
                pinakas[pos] = pinakas[pos - 1];
                pos--;
            }

            pinakas[pos] = temp;
        }
    }

    public static void insertSort_2(Foititis pinakas[])
    {
        boolean found;
        int j, temp;

        for(int i = 1; i < pinakas.length; i++)
        {
            j = 0;
            found = false;

            Foititis temp2 = pinakas[i];

            while(j < i && !found)
            {
                if(pinakas[i].getAm() < pinakas[j].getAm())
                {
                    found = true;
                }
                else
                {
                    j++;
                }

                if(found)
                {
                    temp = pinakas[i].getAm();

                    for(int k = i - 1; k >= j; k--)
                    {
                        pinakas[k + 1] = pinakas[k];
                        pinakas[j] = temp2;
                    }
                }
            }
        }
    }

    public static void selectSort(Foititis pinakas[])
    {
        int min, temp;

        for(int i = 0; i < pinakas.length - 1; i++)
        {
            min = i;

            for(int k = i + 1; k < pinakas.length; k++)
            {
                if(pinakas[k].getEponumo().compareTo(pinakas[min].getEponumo()) < 0)
                {
                    min = k;
                }
            }

            Foititis temp2 = pinakas[min];
            pinakas[min] = pinakas[i];
            pinakas[i] = temp2;
        }
    }

    public static void bubbleSort(Foititis pinakas[])
    {
        int i, j;

        for(i = 1; i < pinakas.length; i++)
        {
            for(j = 0; j < pinakas.length - 1; j++)
            {
                if(pinakas[j].getEtos() > pinakas[j + 1].getEtos())
                {
                    Foititis temp = pinakas[j];
                    pinakas[j] = pinakas[j + 1];
                    pinakas[j + 1] = temp;
                }
            }
        }
    }
}
