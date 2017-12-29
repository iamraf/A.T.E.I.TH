//http://aetos.it.teithe.gr/~adamidis/OOP/OOP_lab5_compos-inher.pdf

class lab5_1
{
    public static void main(String[] args)
    {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Vehicle(150, 50, 2015);
        vehicles[0].setIdioktitis("Kappa Keppo");
        vehicles[0].setArKykloforias("TEST123");

        System.out.println("Kuvismos: " + vehicles[0].getKyvismos());
        System.out.println("Ippodunami: " + vehicles[0].getIppodynami());
        System.out.println(vehicles[0].toString());

        vehicles[0].vazeiEmpros();
        vehicles[0].striveiAristera();
        vehicles[0].svynei();
    }
}
