//http://aetos.it.teithe.gr/~adamidis/OOP/OOP_lab7_generPolym_2.pdf

class lab7
{
    public static void main(String[] args)
    {
        Tilefono ex1 = new Kinito("6123456789", 0, 0, 0, 0);
        Tilefono ex2 = new Stathero("2123456789", 0, 0, 0, 0);
        Tilefono ex3 = new Stathero("2312312312", 0, 0, 0, 0);
        Tilefono ex4 = new Stathero("2322212312", 0, 0, 0, 0);
        Tilefono ex5 = new Kinito("6323123221", 0, 0, 0, 0);

        Company company = new Company();

        company.setTilefono(ex1, 0);
        company.setTilefono(ex2, 1);
        company.setTilefono(ex3, 2);
        company.setTilefono(ex4, 3);
        company.setTilefono(ex5, 4);

        company.randomCalls();

        company.printAll();

        company.calculateStatheraCosts();
        company.calculateKinitaCosts();

        company.calculateStatheraSeconds();
        company.calculateKinitaSeconds();

        company.calculateAllCosts();
    }
}
