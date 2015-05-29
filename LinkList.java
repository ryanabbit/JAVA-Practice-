package test;

public abstract class LinkList<T> {
    protected int count;
    protected Node<T> first;
    protected Node<T> last;
    public Node<T> getFirst(){
    	return first;
    	
    }
    public Node<T> getLast(){
    	return last;
    }
    public int size(){
    	return count;
    	
    }
    abstract public void addFirst(T value);
    abstract public void addLast(T value);
    abstract public void addBefore(Node<T> node, T value);
    abstract public void addAfter(Node<T> node, T value);
    abstract public void removeFirst(Node<T> node, T value);
    abstract public void removeFirst();
    abstract public void removelast();
    abstract public void remove(Node<T> node);
	public void remove() {
		// TODO Auto-generated method stub
		
	}
    }
