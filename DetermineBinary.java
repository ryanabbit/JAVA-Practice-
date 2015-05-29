package test;
// This is a practice class to detect if a tree if a binary tree.
public class DetermineBinary {
	class Node {
		
		int key;
		String name;
		Node leftChild;
		Node rightChild;
			
		Node(int key, String name) {
		this.key = key;
		this.name = name;
		}
		}
		Node root;
		Boolean Binary=true;
		
	@SuppressWarnings("unused")
	
	public void  Inorder(Node focusNode){
		if ((focusNode.leftChild!=null && focusNode.key<focusNode.leftChild.key)
		 ||(focusNode.rightChild!=null && focusNode.key>focusNode.rightChild.key))
	      {Binary=false;
	        return ; }
		if(focusNode!=null){
			Inorder(focusNode.leftChild);
			Inorder(focusNode.rightChild);
		}
		else {return ;}
	}
		
	public Boolean determine(Node focusNode){
		Inorder(focusNode);
		return Binary;
		
	}
		
		
		
		
	}
	

