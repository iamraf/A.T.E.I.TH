//http://aetos.it.teithe.gr/~adamidis/OOP/OOP_lab2_search.pdf

class lab2
{
    public static void main(String[] args)
    {
        Foititis[] pinakas = new Foititis[10];

        pinakas[0] = new Foititis("Kappa1", "Kappa1", 1, 2014);
        pinakas[1] = new Foititis("Kappa2", "Kappa2", 2, 2015);
        pinakas[2] = new Foititis("Kappa3", "Kappa3", 4, 2009);
        pinakas[3] = new Foititis("Kappa4", "Kappa4", 9, 2005);
        pinakas[4] = new Foititis("Kappa5", "Kappa5", 17, 2017);
        pinakas[5] = new Foititis("Kappa6", "Kappa6", 24, 2016);
        pinakas[6] = new Foititis("Kappa7", "Kappa7", 43, 2011);
        pinakas[7] = new Foititis("Kappa8", "Kappa8", 50, 2012);
        pinakas[8] = new Foititis("Kappa9", "Kappa9", 61, 2011);
        pinakas[9] = new Foititis("Kappa10", "Kappa10", 85, 2016);

        //Seiriaki
        System.out.print("Dose epitheto gia anazitisi: ");
        String epitheto = UserInput.getString();

        int i = MyUtils.anazitisiMeEponimo(pinakas, epitheto);

        System.out.println(i != -1 ? ("Onoma " + pinakas[i].getOnoma() + "\nEpitheto " + pinakas[i].getEponumo() + "\nAm " + pinakas[i].getAm() + "\nEtos " + pinakas[i].getEtos()) : "Den vrethike");

        //Duadiki
        System.out.print("Dose AM gia anazitisi: ");
        int AM = UserInput.getInteger();

        int i = MyUtils.anazitisiMeArMitroou(pinakas, AM);

        System.out.println(i != -1 ? ("Onoma " + pinakas[i].getOnoma() + "\nEpitheto " + pinakas[i].getEponumo() + "\nAm " + pinakas[i].getAm() + "\nEtos " + pinakas[i].getEtos()) : "Den vrethike");

        //Anadromis
        System.out.print("Dose AM gia anazitisi: ");
        int AM = UserInput.getInteger();

        int i = MyUtils.anadromiAnazMeArithMitrwou(pinakas, AM, 0, pinakas.length - 1);

        System.out.println(i != -1 ? ("Onoma " + pinakas[i].getOnoma() + "\nEpitheto " + pinakas[i].getEponumo() + "\nAm " + pinakas[i].getAm() + "\nEtos " + pinakas[i].getEtos()) : "Den vrethike");
    }
}
