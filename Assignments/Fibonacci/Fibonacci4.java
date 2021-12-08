public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Question 4: ");
                System.out.println("The sum of squares of the first seven Fibonacci numbers is: " + fibonacciIterativeSquares(7));
		System.out.println("The pattern that emerges if you continuously add the squares of Fibonacci numbers is: " +
		fibonacciIterativeSquares(0) + " " + fibonacciIterativeSquares(1) + " " + fibonacciIterativeSquares(2) + " " + fibonacciIterativeSquares(3) + " " + 
                fibonacciIterativeSquares(4) + " " + fibonacciIterativeSquares(5) + " " + fibonacciIterativeSquares(6));
		System.out.println();
                
                System.out.println("Sucess! Your program works.");

	}
        
        //#4 - iterative function for adding the squares of Fibonacci numbers
        //What pattern emerges if you continuously add the squares of Fibonacci numbers? (i.e., what happens every time you add another number to this 1+1+4+9…)
	//The pattern I got is, 0 1 2 6 15 40. When comparing to the original Fibonacci numbers, we can see that every number produced is the product of pairs of Fibonacci numbers
        public static int fibonacciIterativeSquares(int x) {
		int count = 0;
		int prevFibonacci = 0;
		int temp = 1;
		int fibonacci = -1;
		int sum=0;
		
		if(x == 0) return 0;
		if(x == 1) return 1;

		else {
			while(count < x - 1) {
				fibonacci = prevFibonacci + temp;
				prevFibonacci = temp;
				temp = fibonacci;	
				count++;
				sum += (fibonacci * fibonacci);	
			}
		}
		return sum + 1;
            }	
}