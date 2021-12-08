public class LinkedListsMain {
    
    public static void main(String[] args) {
        LinkedLists LL = new LinkedLists();
        
        LinkedLists.insert(LL, 100);
        LinkedLists.insert(LL, 101);
        LinkedLists.insert(LL, 102);
        LinkedLists.insert(LL, 103);
        LinkedLists.insert(LL, 104);
        LinkedLists.insert(LL, 105);
        LinkedLists.insert(LL, 106);    
        
        System.out.println("\n\nQuestion 4");
        System.out.println("The value of the first node is: " + LL.head.value);
        System.out.println("The value of the last node is: " + LL.tail.value);  
        
        System.out.println("The previous tail node value is: " + LL.tail.prevNode.value);
        System.out.println("\nTraverse the list in reverse: ");
        LinkedLists.print(LL);
        
        System.out.println("\n\n" + "Good job. This program works!");
    }
}