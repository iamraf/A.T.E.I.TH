class MyUtils
{
    //Quick Sort

    public static void quickSort(Foititis[] pinakas, int f, int l)
    {
        if(l > f)
        {
            int pivotIndex = partition(pinakas, f, l);
            quickSort(pinakas, f, pivotIndex - 1);
            quickSort(pinakas, pivotIndex + 1, l);
        }
    }

    public static int partition(Foititis[] pinakas, int first, int last)
    {
        int pivot = pinakas[first].getAm(), low = first + 1, high = last;

        while(high > low)
        {
            while(low <= high && pinakas[low].getAm() <= pivot)
            {
                low++;
            }

            while(low <= high && pinakas[high].getAm() > pivot)
            {
                high--;
            }

            if(high > low)
            {
                Foititis temp = pinakas[high];
                pinakas[high] = pinakas[low];
                pinakas[low] = temp;
            }
        }

        while(high > first && pinakas[high].getAm() >= pivot)
        {
            high--;
        }

        if(pivot > pinakas[high].getAm())
        {
            Foititis temp = pinakas[first];
            pinakas[first] = pinakas[high];
            pinakas[high] = temp;

            return high;
        }
        else
        {
            return first;
        }
    }

    //Merge Sort

    public static void mergeSort(Foititis[] pinakas, int f, int l)
    {
        if(f == l)
        {
            return;
        }

        int mid = (f + l) / 2;

        mergeSort(pinakas, f, mid);
        mergeSort(pinakas, mid + 1, l);
        merge(pinakas, f, l, mid);
    }

    public static void merge(Foititis[] pinakas, int f, int l, int mid)
    {
        int n = l - f + 1;
        int i1 = f, i2 = mid + 1, j = 0;

        Foititis[] pinakas2 = new Foititis[n];

        while(i1 <= mid && i2 <= l)
        {
            if(pinakas[i1].getAm() < pinakas[i2].getAm())
            {
                pinakas2[j] = pinakas[i1];

                i1++;
            }
            else
            {
                pinakas2[j] = pinakas[i2];

                i2++;
            }

            j++;
        }

        while(i1 <= mid)
        {
            pinakas2[j] = pinakas[i1];

            i1++;
            j++;
        }

        while(i2 <= l)
        {
            pinakas2[j] = pinakas[i2];

            i2++;
            j++;
        }

        for(j = 0; j < n; j++)
        {
            pinakas[f + j] = pinakas2[j];
        }
    }
}
