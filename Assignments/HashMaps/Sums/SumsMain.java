import java.util.*;
public class Sums {

	public static void main(String[] args) {
		int[] arrayone = {3, 9, 12, 2, 6};
		int[] answer = TwoSums.findThe2Sums(arrayone, 8);
		System.out.print ("The sum of 9 is the combination of two numbers in the array which are: ");
		for (int x = 0; x < answer.length; x++) {
			if (x == answer.length - 1)
				System.out.print (arrayone[answer[x]]);
			else
				System.out.print (arrayone[answer[x]] + ", ");
		}
		System.out.println();
						
		int[] arraytwo = {3, 9, 12, 2, 6};
		List <Integer[]> answertwo = ThreeSums.findThe3Sums(arraytwo, 14);
		System.out.print ("The sum of 17 is the combination of three numbers in the array which are: ");
		for (Integer[] outer:answertwo) {
			  for (Integer inner : outer) {
			    System.out.print(inner + ", ");
			  }
		}
        } 
}
