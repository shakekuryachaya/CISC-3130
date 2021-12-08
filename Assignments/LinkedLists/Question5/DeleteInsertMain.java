public class LinkedListsMain {
    
    public static void main(String[] args) {
        //the original list of values
        LinkedLists LL = new LinkedLists();
        
        LinkedLists.insert(LL, 100);
        LinkedLists.insert(LL, 101);
        LinkedLists.insert(LL, 102);
        LinkedLists.insert(LL, 103);
        LinkedLists.insert(LL, 104);
        LinkedLists.insert(LL, 105);
        LinkedLists.insert(LL, 106);    
        
        System.out.println("\n\nQuestion 5a");
        System.out.println("The node values are as follows: ");
        LinkedLists.print(LL);
         
        LinkedLists.deleteValue(LL, 99);
        System.out.println("After deleting 99, the node values are as follows: ");
        LinkedLists.print(LL);
        System.out.println("\n\nLet's go ahead and delete the value 103 from the list");
        LinkedLists.deleteValue(LL, 103);
        
        System.out.println("The node values are as follows: ");
        LinkedLists.print(LL);
        
        System.out.println("\n\nQuestion 5b");
        System.out.println("The current node values are as follows: ");
        LinkedLists.print(LL);
        LinkedLists.insertValue(LL, 101);
        LinkedLists.insertValue(LL, 0);
        LinkedLists.insertValue(LL, 9);
        LinkedLists.insertValue(LL, 50);
        LinkedLists.insertValue(LL, 120);
       
        System.out.println("\n\nThe node values after inserting values are as follows: ");
        LinkedLists.print(LL);
        
        System.out.println("\n\n" + "Good job. This program works!");
    }
}