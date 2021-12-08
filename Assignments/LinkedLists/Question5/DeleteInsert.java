//Modify so that one pointer points to the node before the current node and the other
//points to the node after the current node
//This is called a doubly linked list
import java.io.*;
public class LinkedLists {
	Node head;
	
	static class Node   {
		int value;
		Node nextNode;
		Node (int value, Node x)   {
			this.value = value;
			nextNode = x;   }
		Node (int value)   {
			this.value = value;
			nextNode = null;   }
	}
	
	public static LinkedLists insert (LinkedLists list, int value) {
		Node newNode = new Node (value);
		newNode.nextNode = null;
		
		if (list.head==null)
			list.head=newNode;
		else {
			Node end = list.head;
			while (end.nextNode != null) {
				end = end.nextNode;   }
			end.nextNode = newNode;   }
                //return the list
		return list;
	}
        
	public static LinkedLists insertValue (LinkedLists list, int value) {
		Node newNode = new Node (value);
		if (list.head == null)
			list.head = newNode;
		else {
			if (newNode.value < list.head.value) { //function figures out where to insert new values based on number
				newNode.nextNode = list.head;
				list.head = newNode;  }
			else if (newNode.value == list.head.value){
				newNode.nextNode = list.head.nextNode;
				list.head.nextNode = newNode;	
			}
			else {
				Node reference = list.head;
				while (reference.nextNode != null && newNode.value > reference.nextNode.value) {
					reference = reference.nextNode;
                        }
				newNode.nextNode = reference.nextNode;
				reference.nextNode = newNode;		
                    }
			
            }
		return list;
		
    }
	public static void deleteValue (LinkedLists list, int value) {
		if (list.head == null) 
                    return;
		if (list.head.value == value) {
			list.head = list.head.nextNode;
			return;   
                }
		Node reference = list.head;
		while (reference.nextNode != null) {
			if (reference.nextNode.value == value) {
				reference.nextNode = reference.nextNode.nextNode;
				return;
			}
			reference = reference.nextNode;   }
		System.out.println ("\nSorry. The data value " + value + " doesn’t exist in the list!\n");
	}
	public static void print (LinkedLists list) {
		Node reference = list.head;
		while (reference != null) {
			System.out.print (reference.value + " ");
			reference = reference.nextNode;
		}
	}

}
