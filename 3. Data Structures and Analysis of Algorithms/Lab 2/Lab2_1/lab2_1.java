//http://aetos.it.teithe.gr/~demos/Downloads/DS_LAB2.pdf

class lab2_1
{
    public static void main(String[] args)
    {
        ArrayStack students = new ArrayStack(2);

        students.push(new Student(1, "Kappa", "Keepo", 20, 'M', 2, 9.0));
        students.push(new Student(2, "Test", "Test", 18, 'F', 5, 4.0));

        System.out.println("Students size: " + students.size());
        System.out.println("Students top: " + ((Student) students.top()).getName());
        System.out.println("Students isEmpty: " + (students.isEmpty() ? "true" : "false"));
        System.out.println("Students isFull: " + (students.isFull() ? "true" : "false"));

        System.out.println("Students pop: " + ((Student) students.pop()).getName());
        System.out.println("Students new size: " + students.size());
    }
}
