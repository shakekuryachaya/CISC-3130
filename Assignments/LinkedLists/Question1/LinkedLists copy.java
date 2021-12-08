//for input and output
import java.io.*;

public class LinkedLists {
	Node head;
	static class Node {
		int values;
		Node nextNode;
		
		Node(int values, Node x) {
			this.values = values;
			nextNode = x; 	}
		
		Node(int values) {
			this.values = values;
			nextNode = null;    }
            }
	
        //insert function
	public static LinkedLists insert(LinkedLists list, int values) {
		Node newNode = new Node(values);
		newNode.nextNode = null;
		
		if(list.head == null)
			list.head = newNode;
		else {
			Node end = list.head;
			while(end.nextNode != null) {
				end = end.nextNode;   }
			end.nextNode = newNode;   }
		return list;
            }
	
	public static void print(LinkedLists list) {
		Node reference = list.head;
		while(reference != null) {
			System.out.print(reference.values  + " \n");
			reference = reference.nextNode;
		}
            }
}