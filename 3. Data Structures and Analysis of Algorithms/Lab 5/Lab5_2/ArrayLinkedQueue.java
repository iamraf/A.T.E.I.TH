class ArrayLinkedQueue implements Queue
{
    private SimpleLinkedList simpleLinkedList;

    ArrayLinkedQueue()
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

    public Object front() throws QueueEmptyException
    {
        if(isEmpty())
        {
            throw new QueueEmptyException("Queue is empty");
        }

        return simpleLinkedList.getFirst();
    }

    public void enqueue(Object item) throws QueueFullException
    {
        if(isFull())
        {
            throw new QueueFullException("Queue overflow");
        }

        simpleLinkedList.insertLast(item);
    }

    public Object dequeue() throws QueueEmptyException
    {
        if(isEmpty())
        {
            throw new QueueEmptyException("Queue is empty");
        }

        return simpleLinkedList.removeFirst();
    }
}
