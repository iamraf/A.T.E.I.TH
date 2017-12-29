class TreeNode
{
    private TreeNode left;
    private int item;
    private TreeNode right;

    TreeNode(int data)
    {
        item = data;
        left = right = null;
    }

    public int getNodeData()
    {
        return item;
    }

    public TreeNode getLeftNode()
    {
        return left;
    }

    public TreeNode getRightNode()
    {
        return right;
    }

    public boolean isLeaf()
    {
        return right == null && left == null;
    }

    public void setLeftNode(TreeNode node)
    {
        left = node;
    }

    public void setRightNode(TreeNode node)
    {
        right = node;
    }

    public void insert(int d)
    {
        if(d < item)
        {
            if(left == null)
            {
                left = new TreeNode(d);
            }
            else
            {
                left.insert(d);
            }
        }
        else
        {
            if(right == null)
            {
                right = new TreeNode(d);
            }
            else
            {
                right.insert(d);
            }
        }
    }
}
