package test;

public class ReverseLinkedList {

	public static void main(String args[]){
		Node<String> a=new Node<String>("A");
		Node<String> b=new Node<String>("B");
		Node<String> c=new Node<String>("C");
		Node<String> d=new Node<String>("D");
		Node<String> e=new Node<String>("E");
		a.setNext(b);
		b.setNext(c);
		c.setNext(d);
		d.setNext(e);
		e.setNext(null);
		System.out.print(a.getValue());
		System.out.print("->");
		System.out.print(a.getNext().getValue());
		System.out.print("->");
		System.out.print(b.getNext().getValue());
		System.out.print("->");
		System.out.print(c.getNext().getValue());
		System.out.print("->");
		System.out.print(d.getNext().getValue());
		System.out.print("->");
		System.out.print(e.getNext());
		System.out.println("");
	
		Reverse(a);
		System.out.print(e.getValue());
		System.out.print("->");
		System.out.print(e.getNext().getValue());
		System.out.print("->");
		System.out.print(d.getNext().getValue());
		System.out.print("->");
		System.out.print(c.getNext().getValue());
		System.out.print("->");
		System.out.print(b.getNext().getValue());
		System.out.print("->");
		System.out.print(a.getNext());
		
	}
	public static Node Reverse(Node list){
		
		
		
		
		if(list.getNext()==null)
			return null;
		
		
		Node secondElem = list.getNext();
		list.setNext(null);
		
		Node reverseRest = Reverse(secondElem);
		
		secondElem.setNext(list);

	    return reverseRest;
	
		
		
		
	}
}
