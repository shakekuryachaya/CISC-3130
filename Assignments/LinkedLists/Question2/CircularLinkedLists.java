//modified linked list to get circular linked list
//the circular linked list is a kind of linked list
//the tail node points to the head node of the list hence making it circular
import java.io.*;
public class LinkedLists  {
	Node head = null;
	Node tail = null;
	public static class Node  {
            
		int values;
		Node nextNode;
		Node(int values) {
			this.values = values;   }
	}
	
        //got guidance from https://www.baeldung.com/java-circular-linked-list
        //takes value to be inserted as a parameter
	public static LinkedLists insert(LinkedLists list, int values) {
		Node newNode = new Node(values);
		
		if(list.head == null)
			list.head = newNode;
		else {
			list.tail.nextNode = newNode;   }
		list.tail = newNode; //tail points to the new node
		list.tail.nextNode = list.head; //tail points to the head instead of next position
		
                //return statement
		return list;
	}
	
	public static void print(LinkedLists list) {
		Node reference = list.head;
		if(reference != null) {
			do {
			System.out.print(reference.values + " ");
			reference = reference.nextNode;
			}
                        while(reference != list.head);
		}
	}

}