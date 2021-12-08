//Modify 3 so that one pointer points to the node before the current node and the other
//points to the node after the current node
//This is called a doubly linked list
//Question 4

import java.io.*;
public class LinkedLists {
	Node head;
	Node tail;
	
	static class Node  {
		int value;
		Node nextNode;
		Node prevNode;
		
		Node (int value, Node nextNode, Node prevNode)  {
			this.value = value;
			this.nextNode = nextNode; 	
			this.prevNode = prevNode;   }
		Node (int value){
			this(value, null, null);   }
	}
	
	public static LinkedLists insert (LinkedLists list, int value) {
		Node newNode=new Node (value);
	
		if (list.head == null) {
			list.head = newNode;
			list.tail = newNode;  }
		else {
			Node end = list.head;
			while (end.nextNode != null) {
				end = end.nextNode;  }
			end.nextNode = newNode;
			list.tail = end.nextNode;
			list.tail.prevNode = end;
                    }
                //return the list
		return list;
            }
        
                //print the node values
                public static void print (LinkedLists list) {
		Node reference = list.head;
		while (reference != null) {
			System.out.print (reference.value + " ");
			reference = reference.nextNode;

                //when tail is reached, list is reversed
			if(reference == list.tail) {
                            do {
			System.out.print (reference.value + " ");
			reference = reference.prevNode;  }
                            while (reference != null);   }
            }
    }
        //4a part - a circular doubly linked list is much more complex and would have a node containing pointers to its previous node as well as the next node.
        //The first node also known as HEAD is always used as a reference to traverse the list, in this case the traverse
        //function would need to be modified since the value would contantly point to the tail in a loop. The function would have to stop printing the 
        //values everytime the node pointed to the tail. 
    }