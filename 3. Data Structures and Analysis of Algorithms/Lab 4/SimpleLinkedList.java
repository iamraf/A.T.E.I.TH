class SimpleLinkedList implements List
{
    private SLListNode firstNode, lastNode;
    private int size;

    public SimpleLinkedList()
    {
        firstNode = lastNode = null;
        size = 0;
    }

    public SLListNode getFirst()
    {
        return firstNode;
    }

    public SLListNode getLast()
    {
        return lastNode;
    }

    public boolean isEmpty()
    {
        return firstNode == null;
    }

    public int size()
    {
        return size;
    }

    public void insertFirst(Object newItem)
    {
        if(isEmpty())
        {
            firstNode = lastNode = new SLListNode(newItem, null);
        }
        else
        {
            firstNode = new SLListNode(newItem, firstNode);
        }

        size++;
    }

    public void insertLast(Object newItem)
    {
        if(isEmpty())
        {
            firstNode = lastNode = new SLListNode(newItem, null);
        }
        else
        {
            SLListNode B = new SLListNode(newItem, null);
            lastNode.setNext(B);
            lastNode = B;
        }

        size++;
    }

    public Object removeFirst() throws ListEmptyException
    {
        if(isEmpty())
        {
            throw new ListEmptyException("Empty List!!!");
        }

        Object removeItem = firstNode.getItem();

        if(firstNode == lastNode)
        {
            firstNode = lastNode = null;
        }
        else
        {
            firstNode = firstNode.getNext();
        }

        size--;

        return removeItem;
    }

    public Object removeLast() throws ListEmptyException
    {
        if(isEmpty())
        {
            throw new ListEmptyException("Empty List!!!");
        }

        Object removeItem = lastNode.getItem();

        if(firstNode == lastNode)
        {
            firstNode = lastNode = null;
        }
        else
        {
            SLListNode current = firstNode;

            while(current.getNext() != lastNode)
            {
                current = current.getNext();
            }

            lastNode = current;
            current.setNext(null);
        }

        size--;

        return removeItem;
    }

    public void printList()
    {
        if(isEmpty())
        {
            System.out.println("Empty List");
        }
        else
        {
            SLListNode current = firstNode;

            while(current != null)
            {
                System.out.print(current.getItem().toString() + " ");
                current = current.getNext();
            }

            System.out.println("\n");
        }
    }
}
