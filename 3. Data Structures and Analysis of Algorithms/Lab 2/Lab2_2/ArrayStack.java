class ArrayStack implements Stack
{
    public static final int CAPACITY = 100;
    private int capacity;
    private Object[] object;
    private int top = -1;

    ArrayStack()
    {
        this(CAPACITY);
    }

    ArrayStack(int capacity)
    {
        this.capacity = capacity;
        object = new Object[capacity];
    }

    public int size()
    {
        return top + 1;
    }

    public boolean isEmpty()
    {
        return top < 0;
    }

    public boolean isFull()
    {
        return size() == capacity;
    }

    public Object top() throws StackEmptyException
    {
        if(isEmpty())
        {
            throw new StackEmptyException("Stack is empty.");
        }

        return object[top];
    }

    public void push(Object item) throws StackFullException
    {
        if(isFull())
        {
            throw new StackFullException("Stack is full.");
        }

        object[++top] = item;
    }

    public Object pop() throws StackEmptyException
    {
        if(isEmpty())
        {
            throw new StackEmptyException("Stack is empty.");
        }

        Object tmp;
        tmp = object[top];
        object[top--] = null;

        return tmp;
    }
}
