//http://aetos.it.teithe.gr/~adamidis/OOP/OOP_lab5_compos-inher.pdf

class lab5_2
{
    public static void main(String[] args)
    {
        Oromisthioi oromisthios1 = new Oromisthioi("Test1", "Kappa1", 10, 50);
        Oromisthioi oromisthios2 = new Oromisthioi("Test2", "Kappa2", 11, 45);

        Misthotoi misthotos1 = new Misthotoi("Test3", "Kappa3", 12, 2, 15);
        Misthotoi misthotos2 = new Misthotoi("Test4", "Kappa4", 13, 1, 20);

        Proistamenoi proistamenos1 = new Proistamenoi("Test5", "Kappa5", 14, 1, 20);
        Proistamenoi proistamenos2 = new Proistamenoi("Test6", "Kappa6", 15, 3, 35);

        System.out.println(oromisthios1.toString());
        System.out.println(oromisthios2.toString());

        System.out.println(misthotos1.toString());
        System.out.println(misthotos2.toString());

        System.out.println(proistamenos1.toString());
        System.out.println(proistamenos2.toString());
    }
}
