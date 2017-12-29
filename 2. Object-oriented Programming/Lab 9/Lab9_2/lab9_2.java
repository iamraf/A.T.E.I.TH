//http://aetos.it.teithe.gr/~adamidis/OOP/OOP_lab9_interfaces_multinher.pdf

class lab9_2
{
    public static void main(String[] args)
    {
        Fotografia test = new Fotografia("Kappa", 15, false);

        System.out.println(test.getPerigrafi());
        System.out.println(test.getApodektiTimi(5));

        AgoraParadosi test2 = new AgoraParadosi("Kappa2", 15, 12.5, true, 20, 15.4, 2.5, 19.9);

        System.out.println(test2.getPerigrafi());
        System.out.println(test2.isEuthrausto());
    }
}
