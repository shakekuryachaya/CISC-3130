public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Question 2: ");
                System.out.println("In our iterative Fibonacci function, the Fibonacci number in the 1st position is: " + fibonacciIterative(1));
                System.out.println("In our iterative Fibonacci function, the Fibonacci number in the 4th position is: " + fibonacciIterative(4));
		System.out.println("In our iterative Fibonacci function, the Fibonacci number in the 8th position is: " + fibonacciIterative(8));
		System.out.println();
                
                System.out.println("Sucess! Your program works.");

	}
        
        //#2 - method to iteratively calculate the Fibonacci numbers
	public static int fibonacciIterative(int x) {
		int count = 0;
		int prevFibonacci = 0;
		int temp = 1;
		int fibonacci = -1;
		
		if(x == 0 || x == 1) fibonacci = x;
		else {
			while(count < x - 1) {
				fibonacci = prevFibonacci + temp;
				prevFibonacci = temp;
				temp = fibonacci;	
				count++;
			}
		}
		return fibonacci;
	}	
}