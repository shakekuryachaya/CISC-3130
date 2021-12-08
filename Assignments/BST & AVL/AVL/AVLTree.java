public class AVLTree {
    NodeClass root;
	 
    int height (NodeClass A) {
        if (A == null)
            return 0;
        return A.height;
    }   
    //gets the max of two integers
    int max (int a, int b) {
        return (a > b) ? a : b;
    }
        //right rotates subtree
        NodeClass rightRotate (NodeClass y) {
        //T2 is a subtree of the tree
        NodeClass x = y.left;
        NodeClass T2 = x.right;
 
        //rotation is done here
        x.right = y;
        y.left = T2;
 
        //heights are updated
        y.height = max (height(y.left), height(y.right)) + 1;
        x.height = max (height(x.left), height(x.right)) + 1;

        //this is the new root
        return x;
    }
        //left rotates the subtree
        NodeClass leftRotate (NodeClass x) {
        NodeClass y = x.right;
        NodeClass T2 = y.left;
 
        //rotation is done here
        y.left = x;
        x.right = T2;
 
        //heights are updated
        x.height = max (height(x.left), height(x.right)) + 1;
        y.height = max (height(y.left), height(y.right)) + 1;
 
        return y;
    }
    //gets balance factor of node A
    int getBalance(NodeClass A) {
        if (A == null)
            return 0;
        return height(A.left) - height(A.right);
    }
    
    //BST insertion steps
    NodeClass insert(NodeClass n, int key) { 
        if (n == null)
            return (new NodeClass(key));
        if (key < n.key)
            n.left = insert(n.left, key);
        else if (key > n.key)
            n.right = insert(n.right, key);
        else 
            return n;
 
        //heights get updated once again
        n.height = 1 + max (height(n.left),
                              height (n.right));
         
        int balance = getBalance (n);
 
        //y is left child of z and x is left child of y (Left Left Case)
        if (balance > 1 && key < n.left.key)
            return rightRotate (n);
 
        //y is right child of z and x is right child of y (Right Right Case) 
        if (balance < -1 && key > n.right.key)
            return leftRotate (n);
        
        //y is left child of z and x is right child of y (Left Right Case)
        if (balance > 1 && key > n.left.key) {
            n.left = leftRotate (n.left);
            return rightRotate (n);  }
        
        //y is right child of z and x is left child of y (Right Left Case)
        if (balance < -1 && key < n.right.key) {
            n.right = rightRotate (n.right);
            return leftRotate (n);  }
        return n;
    }  
    
    //traversal is used to create a copy of the tree
    //Preorder traversal is also used to get prefix expression on an expression tree
    void preOrder (NodeClass n) {
        if (n != null) {
            System.out.print (n.key + " ");
            preOrder (n.left);
            preOrder (n.right);
        }
    }
}
