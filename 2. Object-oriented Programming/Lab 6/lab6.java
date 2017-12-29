//http://aetos.it.teithe.gr/~adamidis/OOP/OOP_lab6_generPolym.pdf

class lab6
{
    public static void main(String[] args)
    {
        Car car = new Car("Kappa", "Test1", 2015, 4);
        Truck truck = new Truck("Keepo", "Test2", 2010, 4);
        Motorcycle motorcycle = new Motorcycle("Test", "Test3", 2017, false);

        car.transferOwnership("Asdasd");
        car.drive();

        truck.drive();

        motorcycle.drive();
        motorcycle.transferOwnership("Dsasd");
        motorcycle.drive();
    }
}
