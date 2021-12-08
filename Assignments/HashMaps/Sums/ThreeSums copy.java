import java.util.*;
public class ThreeSums {
	
	static List < Integer[] > findThe3Sums(int[] numbers, int target) {
            
	    List <Integer[]> result = new ArrayList<>();
	    for (int x = 0; x < numbers.length; x++) {
	      int currtarget = target - numbers[x];
              
	      Set<Integer> existing = new HashSet<>();
	      for (int y = x + 1; y < numbers.length; y++) {
	        if (existing.contains (currtarget - numbers[y])) {
	          result.add (new Integer[] { numbers[x], numbers[y], currtarget - numbers[y] });
	        } else  {
	          existing.add (numbers[y]);
	        }
	      }
	    }
	    return result;
	  }
}