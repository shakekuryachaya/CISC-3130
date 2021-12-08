public class BSTMain {
	public static void main(String[] args) {
		binarySearchTree tree = new binarySearchTree(5);
               
		tree.insert(tree.root, 6);		
		tree.insert(tree.root, 17);
		tree.insert(tree.root, 8);
		tree.insert(tree.root, 15);
		tree.insert(tree.root, 3);
		tree.insert(tree.root, 18);
		tree.insert(tree.root, 10);

		System.out.println("The output for the Binary Search Tree is: ");
		tree.traverse(tree.root);
	}
}
