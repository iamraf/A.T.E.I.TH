//http://aetos.it.teithe.gr/~adamidis/OOP/OOP_lab4_ta3inomhsh_2.pdf

class lab4
{
    public static void main(String[] args)
    {
        Foititis[] pinakas = new Foititis[7];

        pinakas[0] = new Foititis("A Kappa", "A Kappa");
        pinakas[0].setAM(5);
        pinakas[0].setEtos(2014);
        pinakas[1] = new Foititis("C Kappa", "C Kappa");
        pinakas[1].setAM(2);
        pinakas[1].setEtos(2015);
        pinakas[2] = new Foititis("F Kappa", "F Kappa");
        pinakas[2].setAM(8);
        pinakas[2].setEtos(2009);
        pinakas[3] = new Foititis("B Kappa", "B Kappa");
        pinakas[3].setAM(15);
        pinakas[3].setEtos(2005);
        pinakas[4] = new Foititis("D Kappa", "D Kappa");
        pinakas[4].setAM(1);
        pinakas[4].setEtos(2017);
        pinakas[5] = new Foititis("E Kappa", "E Kappa");
        pinakas[5].setAM(24);
        pinakas[5].setEtos(2016);
        pinakas[6] = new Foititis("G Kappa", "G Kappa");
        pinakas[6].setAM(20);
        pinakas[6].setEtos(2011);

        //QuickSort
        MyUtils.quickSort(pinakas, 0, pinakas.length - 1);

        //MergeSort
        MyUtils.mergeSort(pinakas, 0, pinakas.length - 1);

        for(int i = 0; i < pinakas.length; i++)
        {
            System.out.println(pinakas[i].getAm());
        }
    }
}
