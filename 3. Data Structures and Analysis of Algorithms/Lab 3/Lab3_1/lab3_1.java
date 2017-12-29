//http://aetos.it.teithe.gr/~demos/Downloads/DS_LAB3.pdf

class lab3_1
{
    public static void main(String[] args)
    {
        ArrayQueue students = new ArrayQueue(2);

        students.enqueue(new Student(1, "Kappa", "Keepo", 20, 'M', 2, 9.0));
        students.enqueue(new Student(2, "Test", "Test", 18, 'F', 5, 4.0));

        System.out.println("Students size: " + students.size());
        System.out.println("Students front: " + ((Student) students.front()).getName());
        System.out.println("Students isEmpty: " + (students.isEmpty() ? "true" : "false"));
        System.out.println("Students isFull: " + (students.isFull() ? "true" : "false"));

        System.out.println("Students dequeue: " + ((Student) students.dequeue()).getName());
        System.out.println("Students new size: " + students.size());
    }
}
