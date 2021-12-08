//Question 3
import java.io.*;
public class LinkedLists {
    
	Node head;
	static class Node {
		int value;
		Node nextNode;
		
		Node(int value, Node x) {
			this.value = value;
			nextNode = x; 	}
		
		Node(int value) {
			this.value = value;
			nextNode = null;  }
            }
	
	//3a
        //a traversal function which traverses through the list by skipping every odd node
	public static void printEvenNodeValues (LinkedLists list) {
		Node reference = list.head;
		
		//last node or not?
		while(reference != null && reference.nextNode != null && reference.nextNode.nextNode != null) {
			System.out.print(reference.value + " ");
			reference = reference.nextNode.nextNode;	
		}
		System.out.print(reference.value + " ");
	}
	
	//3b
        //traversal function which prints the value in the current node and then prints the value in the node that is 3 spaces from the current node
	public static void printNodeValue3SpacesFromCurrent (LinkedLists list) {
		Node reference = list.head;
		
		//last node or not?
		while(reference != null && reference.nextNode != null && reference.nextNode.nextNode != null && reference.nextNode.nextNode.nextNode != null) {
			System.out.print(reference.value + " ");
			reference = reference.nextNode.nextNode.nextNode;
		}
		System.out.print(reference.value + " ");
	}
	
	public static LinkedLists insert (LinkedLists list, int data) {
		Node newNode = new Node(data);
		newNode.nextNode = null;
		
		if(list.head == null)
			list.head = newNode;
		else {
			Node last = list.head;
			while(last.nextNode!=null) {
				last = last.nextNode;  }
			last.nextNode = newNode; }
		return list;	
            }
        
        public static void print (LinkedLists list) {
		Node reference = list.head;
		while(reference != null) {
			System.out.print(reference.value + " ");
			reference = reference.nextNode;
		}
        }
}