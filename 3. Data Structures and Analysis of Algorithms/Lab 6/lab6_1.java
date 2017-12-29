//http://aetos.it.teithe.gr/~demos/Downloads/DS_LAB6.pdf

class lab6_1
{
    public static void main(String[] args)
    {
        DoubleLinkedList list = new DoubleLinkedList();

        boolean flag = true;

        do
        {
            System.out.println("******* DOUBLE LINKED LIST MANAGEMENT *******\n1- INSERT ELEMENT AT THE BEGINNING OF THE LIST\n2- INSERT ELEMENT AT THE END OF THE LIST\n3- INSERT ELEMENT AT POSITION n OF THE LIST\n4- DELETE ELEMENT FROM THE BEGINNING OF THE LIST\n5- DELETE ELEMENT FROM THE END OF THE LIST\n6- DELETE ELEMENT FROM POSITION N OF THE LIST\n7- LIST LENGTH\n8- IS THE LIST EMPTY\n9- PRINT LIST\n0- EXIT");
            System.out.print("INPUT YOUR CHOICE (E.G. 5):");

            int n = UserInput.getInteger();

            switch(n)
            {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.print("GIVE STRING: ");
                    String inf = UserInput.getString();

                    list.insertFirst(inf);
                    break;
                case 2:
                    System.out.print("GIVE STRING: ");
                    String inl = UserInput.getString();

                    list.insertLast(inl);
                    break;
                case 3:
                    System.out.print("GIVE STRING: ");
                    String infp = UserInput.getString();

                    System.out.print("GIVE POSITION: ");
                    int inp = UserInput.getInteger();

                    list.insert(inp, infp);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.print("GIVE POSITION: ");
                    int rnp = UserInput.getInteger();

                    list.remove(rnp);
                    break;
                case 7:
                    System.out.println("LIST LENGTH: " + list.size());
                    break;
                case 8:
                    System.out.println("IS EMPTY: " + list.isEmpty());
                    break;
                case 9:
                    list.printList();
                    break;
                default:
                    System.out.println("WRONG OPTION.\n");
            }
        }
        while(flag);
    }
}
