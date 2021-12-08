public class AVLTreeMain  {
	public static void main(String[] args) {
 
	AVLTree tree = new AVLTree();
		 
        /* Constructing tree given in the above figure */
        tree.root = tree.insert (tree.root, 20);
        tree.root = tree.insert (tree.root, 6);
        tree.root = tree.insert (tree.root, 40);
        tree.root = tree.insert (tree.root, 37);
        tree.root = tree.insert (tree.root, 23);
        tree.root = tree.insert (tree.root, 51);
        
        System.out.println ("The preorder traversal" + " of the tree is: ");
        tree.preOrder (tree.root);
	}
}

