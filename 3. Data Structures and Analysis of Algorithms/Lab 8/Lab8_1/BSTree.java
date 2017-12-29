class BSTree
{
    private TreeNode root;
    private int size;

    BSTree()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public int numberOfNodes()
    {
        return size;
    }

    public int treeHeight()
    {
        return treeHeight(root);
    }

    public int treeHeight(Object data)
    {
        if(data == null)
        {
            return 0;
        }

        int left = treeHeight(((TreeNode) data).getLeftNode());
        int right = treeHeight(((TreeNode) data).getRightNode());

        if(left > right)
        {
            return left + 1;
        }
        else
        {
            return right + 1;
        }
    }

    public void insertElement(Object data)
    {
        if(isEmpty())
        {
            root = new TreeNode(data);
        }
        else
        {
            insertNode(data, root);
        }

        size++;
    }

    public void inOrderTraversal()
    {
        System.out.println("INORDER TRAVERSAL");
        inOrder(root);
        System.out.println();
    }

    public void preOrderTraversal()
    {
        System.out.println("PREORDER TRAVERSAL");
        preOrder(root);
        System.out.println();
    }

    public void postOrderTraversal()
    {
        System.out.println("POSTORDER TRAVERSAL");
        postOrder(root);
        System.out.println();
    }

    private void insertNode(Object data, TreeNode node)
    {
        if(root == null)
        {
            root = new TreeNode(data);
        }
        else
        {
            root.insert(data);
        }
    }

    private void inOrder(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        inOrder(node.getLeftNode());

        System.out.print(node.getNodeData() + " ");

        inOrder(node.getRightNode());
    }

    private void preOrder(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        System.out.print(node.getNodeData() + " ");

        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }

    private void postOrder(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());

        System.out.print(node.getNodeData() + " ");
    }
}
