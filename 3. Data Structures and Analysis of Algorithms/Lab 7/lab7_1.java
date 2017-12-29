//http://aetos.it.teithe.gr/~demos/Downloads/DS_LAB7.pdf

class lab7_1
{
    public static void main(String[] args)
    {
        int matrix[] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5};

        BSTree tree = new BSTree();

        for(int i = 0; i < matrix.length; i++)
        {
            tree.insertElement(matrix[i]);
        }

        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();

        int[] table = tree.sort();

        for(int i : table)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
