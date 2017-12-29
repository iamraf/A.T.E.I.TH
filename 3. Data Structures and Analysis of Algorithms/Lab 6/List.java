interface List
{
    public boolean isEmpty();

    public int size();

    public void insertFirst(Object data);

    public void insertLast(Object data);

    public void insert(int position, Object data) throws NoSuchListPosition;

    public Object removeFirst() throws ListEmptyException;

    public Object removeLast() throws ListEmptyException;

    public Object remove(int position) throws ListEmptyException, NoSuchListPosition;
}
