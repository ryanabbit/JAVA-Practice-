package test;

public class BinaryTree {
	
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
 
 
public void addNode(int key, String name){
	Node newNode=new Node(key,name);
	
	
	if(root==null){
		root=newNode;
	}
	else{
		Node focusNode=root;
		
		Node parent;
		while(true){
			parent=focusNode;
			
		if(key<focusNode.key)
		{
			focusNode=focusNode.leftChild;
			if(focusNode==null){
				parent.leftChild=newNode;
				return;
			}
		}
		else if(key>focusNode.key){
			focusNode=focusNode.rightChild;
			if(focusNode==null){
				parent.rightChild=newNode;
				return;
			}
		}	
		}
	}
	
}

public void inorderTraverseTree(Node focusNode){
	if(focusNode!=null){
		
		inorderTraverseTree(focusNode.leftChild);
		System.out.println(focusNode);
		inorderTraverseTree(focusNode.rightChild);
	}
	else{ return;}
}
public void preorderTraverseTree(Node focusNode){
	if(focusNode!=null){
		System.out.println(focusNode);
		preorderTraverseTree(focusNode.leftChild);
		preorderTraverseTree(focusNode.rightChild);
	}
	else{ return;}
}
public void postorderTraverseTree(Node focusNode){
	if(focusNode!=null){
		System.out.println(focusNode);
		postorderTraverseTree(focusNode.leftChild);
		postorderTraverseTree(focusNode.rightChild);
	}
	else{ return;}
}


public Node findNode(int key){
	Node focusNode=root;
	while(focusNode.key!=key){
	 if(key < focusNode.key){
		 focusNode=focusNode.leftChild;
		 }
	 else if(key > focusNode.key){
		 focusNode=focusNode.rightChild;
	 }
	 if (focusNode==null)
		 return null;
	 
	}
		
	return focusNode;
	}
	
}
