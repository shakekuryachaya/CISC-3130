public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Question 1: ");
		System.out.println("In our recursive Fibonacci function, the 0th Fibonacci number is:  " + fibonacciRecursion(0));
                System.out.println("In our recursive Fibonacci function, the 3rd Fibonacci number is:  " + fibonacciRecursion(3));
                System.out.println("In our recursive Fibonacci function, the 5th Fibonacci number is:  " + fibonacciRecursion(5));
		System.out.println();
                
                System.out.println("Sucess! Your program works.");
	}
        
        ///#1 - method to recursively calculate the Fibonacci numbers
	public static int fibonacciRecursion(int x) {
		if(x == 0) return 0;
		if(x == 1) return 1;
		
		return fibonacciRecursion (x - 1) + fibonacciRecursion (x - 2);
	}
	
}