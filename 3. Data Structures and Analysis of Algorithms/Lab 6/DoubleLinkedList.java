class DoubleLinkedList implements List
{
    private DoubleNode firstNode, lastNode;
    private int size;

    public DoubleLinkedList()
    {
        firstNode = lastNode = null;
        size = 0;
    }

    public DoubleNode getFirst()
    {
        return firstNode;
    }

    public DoubleNode getLast()
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
            firstNode = lastNode = new DoubleNode(newItem, null, null);
        }
        else
        {
            DoubleNode B = new DoubleNode(newItem, firstNode, null);
            firstNode.setPrevious(B);
            firstNode = B;
        }

        size++;
    }

    public void insertLast(Object newItem)
    {
        if(isEmpty())
        {
            firstNode = lastNode = new DoubleNode(newItem, null, null);
        }
        else
        {
            DoubleNode B = new DoubleNode(newItem, null, lastNode);
            lastNode.setNext(B);
            lastNode = B;
        }

        size++;
    }

    public void insert(int position, Object data) throws NoSuchListPosition
    {
        if(position < 0 || position > size())
        {
            throw new NoSuchListPosition("NO SUCH POS");
        }

        if(position == 0)
        {
            insertFirst(data);
        }
        else
        {
            if(position == size())
            {
                insertLast(data);
            }
            else
            {
                DoubleNode current = firstNode;
                int i = 0;

                while(i != position - 1)
                {
                    current = current.getNext();
                    i++;
                }

                DoubleNode B = new DoubleNode(data, current.getNext(), current);
                current.setNext(B);
                current.getNext().setPrevious(B);
            }
        }

        size++;
    }

    public Object remove(int position) throws ListEmptyException, NoSuchListPosition
    {
        if(isEmpty())
        {
            throw new ListEmptyException("Empty List!!!");
        }
        if(position < 0 || position > size())
        {
            throw new NoSuchListPosition("NO SUCH POS");
        }

        Object removeItem;

        if(position == 0)
        {
            removeItem = removeFirst();
        }
        else
        {
            if(position == size())
            {
                removeItem = removeLast();
            }
            else
            {
                DoubleNode current = firstNode;
                int i = 0;

                while(i != position)
                {
                    current = current.getNext();
                    i++;
                }

                removeItem = current.getItem();

                current.getPrevious().setNext(current.getNext());
                current.getNext().setPrevious(current.getPrevious());
            }
        }

        size--;

        return removeItem;
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
            DoubleNode B = firstNode.getNext();
            firstNode.setNext(null);
            B.setPrevious(null);
            firstNode = B;
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
            DoubleNode B = lastNode.getPrevious();
            lastNode.setPrevious(null);
            B.setNext(null);
            lastNode = B;
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
            DoubleNode current = firstNode;

            while(current != null)
            {
                System.out.print(current.getItem().toString() + " ");
                current = current.getNext();
            }

            System.out.println("\n");
        }
    }
}
