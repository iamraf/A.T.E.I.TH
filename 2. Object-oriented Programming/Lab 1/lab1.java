//http://aetos.it.teithe.gr/~adamidis/OOP/OOP_lab1_anadromi.pdf

class lab1
{
    public static void main(String[] args)
    {
        System.out.println(fact(4));

        System.out.println(fibo(3));

        int pallidromos;

        do
        {
            System.out.println("Dose arithmo gia paralilo");
            pallidromos = UserInput.getInteger();
        }
        while(pallidromos < 0 || pallidromos > 99999);

        int result = par(pallidromos);

        System.out.println(pallidromos == result ? "Pallidromos" : "Mh parallilo");
    }

    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return n * fact(n - 1);
        }
    }

    public static int fibo(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return fibo(n - 2) + fibo(n - 1);
        }
    }

    static int parInt = 0;

    public static int par(int n)
    {
        if(n > 0)
        {
            parInt = (parInt * 10) + (n % 10);
            par(n / 10);
        }

        return parInt;
    }
}
