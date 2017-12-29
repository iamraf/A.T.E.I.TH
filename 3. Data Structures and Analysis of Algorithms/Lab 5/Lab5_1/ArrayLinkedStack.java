class ArrayLinkedStack implements Stack
{
    private SimpleLinkedList simpleLinkedList;

    ArrayLinkedStack()
    {
        simpleLinkedList = new SimpleLinkedList();
    }

    public int size()
    {
        return simpleLinkedList.size();
    }

    public boolean isEmpty()
    {
        return simpleLinkedList.isEmpty();
    }

    public boolean isFull()
    {
        return false;
    }

    public Object top() throws StackEmptyException
    {
        if(isEmpty())
        {
            throw new StackEmptyException("Stack is empty.");
        }

        return simpleLinkedList.getFirst();
    }

    public void push(Object item) throws StackFullException
    {
        if(isFull())
        {
            throw new StackFullException("Stack is full.");
        }

        simpleLinkedList.insertFirst(item);
    }

    public Object pop() throws StackEmptyException
    {
        if(isEmpty())
        {
            throw new StackEmptyException("Stack is empty.");
        }

        return simpleLinkedList.removeFirst();
    }
}
