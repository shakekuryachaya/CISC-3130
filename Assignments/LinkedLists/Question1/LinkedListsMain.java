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
        System.out.println("Question 1\n");
        System.out.println("The value of the first node is: " + LL.head.values);
        System.out.println("The node values are as follows: ");
        LinkedLists.print(LL);
        
        System.out.println("\n\n" + "Good job. This program works!");
    }
}