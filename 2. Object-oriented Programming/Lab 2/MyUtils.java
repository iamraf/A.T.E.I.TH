class MyUtils
{
    public static int anazitisiMeEponimo(Foititis[] pinakas, String eponumo)
    {
        for(int i = 0; i < pinakas.length; i++)
        {
            if(pinakas[i].getEponumo().equals(eponumo))
            {
                return i;
            }
        }

        return -1;
    }

    public static int anazitisiMeArMitroou(Foititis[] pinakas, int AM)
    {
        int mid, pos = -1, left = 0, right = pinakas.length - 1;

        while(pos == -1 && left <= right)
        {
            mid = (left + right) / 2;

            if(AM < pinakas[mid].getAm())
            {
                right = mid - 1;
            }
            else
            {
                if(AM > pinakas[mid].getAm())
                {
                    left = mid + 1;
                }
                else
                {
                    pos = mid;
                }
            }
        }

        return pos;
    }

    public static int anadromiAnazMeArithMitrwou(Foititis[] pinakas, int AM, int left, int right)
    {
        int mid = (left + right) / 2;

        if(left > right)
        {
            return -1;
        }
        else
        {
            if(AM == pinakas[mid].getAm())
            {
                return mid;
            }
            else
            {
                if(AM > pinakas[mid].getAm())
                {
                    return anadromiAnazMeArithMitrwou(pinakas, AM, mid + 1, right);
                }
                else
                {
                    return anadromiAnazMeArithMitrwou(pinakas, AM, left, mid - 1);
                }
            }
        }
    }
}
