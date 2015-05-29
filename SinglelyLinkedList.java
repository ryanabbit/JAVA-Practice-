package test;

import java.lang.ArrayIndexOutOfBoundsException;

public class SinglelyLinkedList<T> extends LinkList<T>{

	@Override
	public void addFirst(T value) {
		// TODO Auto-generated method stub
		Node<T> node=new Node<T>(value);
		if (count==0)
			last=node;
		else
			node.setNext(first);
		first=node;
		++count;
	}

	@Override
	public void addBefore(Node<T> node, T value) {
		// TODO Auto-generated method stub
		Node<T> Newnode=new Node<T>(value);
		if (first!=node){
			Node<T> preNode=findPreviousNode(node);
			preNode.setNext(Newnode);
				}
		Newnode.setNext(node);
		++count;
	}

	@Override
	public void addAfter(Node<T> node, T value) {
		// TODO Auto-generated method stub
		Node<T> newNode=new Node<T>(value);
		newNode.setNext(node.getNext());
		node.setNext(newNode);
		++count;
		
	}

	@Override
	public void removeFirst(Node<T> node, T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		if (count==0)
			throw new ArrayIndexOutOfBoundsException();
		else if (count==1)
		{
			first=null;
			last=null;
		}
		else {
			Node<T> node=findPreviousNode(last);
		
		node.setNext(null);
		last=node;
		
		}--count;
		
	}

	@Override
	public void removelast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Node<T> node) {
		// TODO Auto-generated method stub
		if (node==first)
			removeFirst();
		else if (node==last)
			removelast();
		else{
			Node<T> preNode=findPreviousNode(node);
			if (preNode==null)
				throw new ArrayIndexOutOfBoundsException();
			preNode.setNext(node.getNext());
			node.setNext(null);
			--count;
		}
	}

	@Override
	public void addLast(T value) {
		// TODO Auto-generated method stub
		Node<T> node =new Node<T>(value);
		if (count==0)
			first=node;
		else
			last.setNext(node);
		last=node;
		++count;
	}
	private Node<T> findPreviousNode(Node<T> node){
		Node<T> preNode=first;
		while(preNode !=null){
			if (node==preNode.getNext())
				break;
			preNode=preNode.getNext();
			
			
		}return preNode;
	}

}
