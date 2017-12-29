//http://aetos.it.teithe.gr/~adamidis/OOP/OOP_lab9_interfaces_multinher.pdf

class lab9_1
{
    public static void main(String[] args)
    {
        Bird[] Aviary = new Bird[4];

        Aviary[0] = new Bird(4, 5);
        Aviary[1] = new Pegasus(12, 25);
        Aviary[2] = new Bird(7, 4);
        Aviary[3] = new Pegasus(2, 30);

        Aviary[0].fly();
        Aviary[1].fly();
        Aviary[2].chirp();
        ((Pegasus) Aviary[3]).whinny();

        Object[] Ranch = new Object[4];

        Ranch[0] = new Horse(5, 15);
        Ranch[1] = new Pegasus(10, 20);
        Ranch[2] = new Pegasus(4, 35);
        Ranch[3] = new Horse(15, 35);

        ((Horse) Ranch[0]).whinny();
        ((Pegasus) Ranch[1]).whinny();
        ((Pegasus) Ranch[2]).fly();
        ((Horse) Ranch[3]).gallop();
    }
}
