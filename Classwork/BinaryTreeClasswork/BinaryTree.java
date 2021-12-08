import java.util.LinkedList;
import java.util.Queue;
public class Headphones {

	//binary trees node have a key, a pointer to the left child and a pointer to right child
        //this is the required node class
	static class Node {
		int key;
		Node left, right;
		Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}
        
	static Node root;
	static Node n = root;

	//traversal of a binary tree
	static void inOrder(Node n) {
		if (n == null)
		return;
		inOrder(n.left);
		System.out.print(n.key + " ");
		inOrder(n.right);
	}

	//this function inserts element into the binary tree
	static void insert(Node n, int key) {
		if (n == null) {
			root = new Node(key);
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(n);

		//traversal to see if there is an empty place
		while (!queue.isEmpty()) {
			n = queue.peek();
			queue.remove();

			if (n.left == null) {
				n.left = new Node(key);
				break;
			}
			else
				queue.add(n.left);
			if (n.right == null) {
				n.right = new Node(key);
				break;
			}
			else
				queue.add(n.right);
		}
	}

	//this is the main method
	public static void main(String args[]) {
            
		root = new Node(12);
		root.left = new Node(10);
		root.left.left = new Node(3);
		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node(5);

		System.out.print("Traversal before insertion: ");
		inOrder(root);

		int key = 11;
		insert(root, key);

		System.out.print("\nTraversal after insertion: ");
		inOrder(root);
	}
}