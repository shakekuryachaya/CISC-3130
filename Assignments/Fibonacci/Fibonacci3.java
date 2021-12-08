public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Question 3: ");
                System.out.println("The sum of squares of the first seven Fibonacci numbers is: " +
                fibonacciSquares(7));
                System.out.println();
                
                System.out.println("Sucess! Your program works.");

	}
        
        ///#3 - recursive function for adding the squares of Fibonacci numbers
        //What pattern emerges if you add only pairs of squared Fibonacci numbers?
        //the pattern that emerges if you add only pairs of squared Fibonacci numbers is the odd numbers from to original Fibonacci number list
	public static int fibonacciSquares(int x) {
	if (x <= 0)
            return 0;
       
        int fibonacci[] = new int[x + 1];
        fibonacci[0] = 0 ;
        fibonacci[1] = 1 ;
       
        //initialize
        int fibonacciSquares = (fibonacci[0] * fibonacci[0]) + (fibonacci[1] * fibonacci[1]);
       
        //add Fibonacci numbers
        for (int y = 2; y <= x; y++) {
            fibonacci[y] = fibonacci[y - 1] + fibonacci[y - 2];
            fibonacciSquares += (fibonacci[y] * fibonacci[y]);
        }
        return fibonacciSquares;

	}	
}