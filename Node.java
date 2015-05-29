package test;

public class Node<T> {
	private Node<T> previous;
	private Node<T> next;
	private T value;
    public Node<T> getPrevious(){ return previous;}
    void setPrevious(Node<T> previous){ this.previous=previous;}
    public Node<T> getNext(){ return next; }
    void setNext(Node<T> next){ this.next=next;}
    public T getValue(){ return value;}
    void setValue(T value) 
    { 
        this.value = value;
    }
 
    public Node(T value)
    {
        this.value = value;
    }
    
}
