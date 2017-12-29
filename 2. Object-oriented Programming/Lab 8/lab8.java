//http://aetos.it.teithe.gr/~adamidis/OOP/OOP_lab8_exceptions_packages.pdf

class lab8
{
    public static void main(String[] args) throws InvalidBirthDateException, InvalidHoursException
    {
        int[] workingHours = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] overTime = {2, 1, 4, 0, 4, 3, 5, 7, 1, 2, 0, 1};

        Ypallilos ypallilos1 = new Ypallilos("Test1", "01/12/2014", workingHours, overTime, 40, 1);
        System.out.println("Apodoxes " + ypallilos1.ypologismosApodohon());
    }
}
