interface Stack
{
    public int size();

    public boolean isEmpty();

    public boolean isFull();

    public Object top() throws StackEmptyException;

    public void push(Object item) throws StackFullException;

    public Object pop() throws StackEmptyException;
}
