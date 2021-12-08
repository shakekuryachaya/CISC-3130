import java.io.*;
public class binarySearchTree {
	Node root;	
	static class Node  {
		Node left;
		Node right;
		int value;
		
		public Node (int value) {
			this.value = value;
			this.left = null;
			this.right = null;  }
	}       
	public binarySearchTree (int value) {
		this.root = new Node(value);
	}
	
	public binarySearchTree () {
		this.root = null;
	}
        
	public void insert (Node init, int value) {	
		if (init == null) 
			init = new Node(value);
		if(value <= init.value) {
			if (init.left == null)
				init.left = new Node(value);
			else
				insert (init.left, value);
		}
		else {
			if(init.right == null)
				init.right = new Node (value);
			else
				insert (init.right, value);  }			
	}	
	public void traverse (Node n) {
	    if (n != null) {
	        System.out.print (n.value + " ");
	        traverse (n.left);
	        traverse (n.right);
	}
    }
}

