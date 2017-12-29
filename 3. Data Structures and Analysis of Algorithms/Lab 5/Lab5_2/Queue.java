interface Queue
{
    public int size();

    public boolean isEmpty();

    public boolean isFull();

    public Object front() throws QueueEmptyException;

    public void enqueue(Object item) throws QueueFullException;

    public Object dequeue() throws QueueEmptyException;
}
