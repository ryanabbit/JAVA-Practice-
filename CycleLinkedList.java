package test;

public class CycleLinkedList {
    // detect a loop in a linked list
	//o(n)time complexity 
	boolean loop(Node first){
		Node firstV=first;
		Node SecondV=first;
		
		while(SecondV.getNext()!=null && SecondV.getNext().getNext()!=null){
			
			firstV=first.getNext();
			SecondV=SecondV.getNext().getNext();
			if(firstV==SecondV);
			return true;
			
			
		}
		return false;
		
		
	} 
}
