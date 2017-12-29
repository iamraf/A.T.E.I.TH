interface List
{
    public boolean isEmpty();

    public int size();

    public void insertFirst(Object data);

    public void insertLast(Object data);

    public Object removeFirst() throws ListEmptyException;

    public Object removeLast() throws ListEmptyException;
}
