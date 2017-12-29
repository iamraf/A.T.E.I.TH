//https://aetos.it.teithe.gr/~demos/Downloads/DS_LAB5.pdf

class lab5_2
{
    public static void main(String[] args)
    {
        ArrayLinkedQueue cars = new ArrayLinkedQueue();

        boolean flag = true;

        do
        {
            System.out.println("1. Afiksi aftokinitou.\n2. Anaxorisi aftokinitou.\n3. Katastasi ouras.\n4. Eksodos.");
            System.out.print("Dose tin epilogi sou: ");

            int n = UserInput.getInteger();

            switch(n)
            {
                case 1:
                    System.out.print("Dose arithmo aftokinitou: ");
                    int ar = UserInput.getInteger();

                    cars.enqueue(new Car(ar));
                    break;
                case 2:
                    System.out.println("To amaksi me aritho " + ((Car) cars.dequeue()).getArithmosAftokinitou() + " anaxorie epitixos.");
                    break;
                case 3:
                    System.out.println("---\nAmaksia stin oura:");

                    int j = cars.size();

                    for(int i = 0; i < j; i++)
                    {
                        Car tmp = (Car) cars.dequeue();
                        System.out.println("Arithmos: " + tmp.getArithmosAftokinitou());
                        cars.enqueue(tmp);
                    }

                    System.out.println("---");
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Lathos epilogi.\n");
            }
        }
        while(flag);
    }
}
