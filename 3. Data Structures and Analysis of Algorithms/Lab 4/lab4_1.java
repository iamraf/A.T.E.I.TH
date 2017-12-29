//http://aetos.it.teithe.gr/~demos/Downloads/DS_LAB4.pdf

class lab4_1
{
    public static void main(String[] args)
    {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();

        boolean flag = true;

        do
        {
            System.out.println("********** LINKED LIST MANAGEMENT **********\n1. INSERT ELEMENT AT THE BEGINNING OF THE LIST\n2. INSERT ELEMENT AT THE END OF THE LIST\n3. DELETE FROM THE BEGINNING OF THE LIST\n4. DELETE FROMTHE END OF THE LIST\n5. LIST LENGTH\n6. IS THE LIST EMPTY\n7. PRINT LIST\n8. EXIT");
            System.out.print("INPUT YOUR CHOICE: ");

            int n = UserInput.getInteger();

            switch(n)
            {
                case 1:
                    System.out.print("GIVE YOUR STRING: ");
                    String i = UserInput.getString();

                    simpleLinkedList.insertFirst(i);
                    break;
                case 2:
                    System.out.print("GIVE YOUR STRING: ");
                    String j = UserInput.getString();

                    simpleLinkedList.insertLast(j);
                    break;
                case 3:
                    simpleLinkedList.removeFirst();
                    break;
                case 4:
                    simpleLinkedList.removeLast();
                    break;
                case 5:
                    System.out.println("LIST LENGTH: " + simpleLinkedList.size());
                    break;
                case 6:
                    System.out.println("IS LIST EMPTY? " + simpleLinkedList.isEmpty());
                    break;
                case 7:
                    simpleLinkedList.printList();
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("WRONG CHOICE.\n");
            }
        }
        while(flag);
    }
}
