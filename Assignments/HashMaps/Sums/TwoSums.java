import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    
	static int[] findThe2Sums(int[] numbers, int target) {           
        Map <Integer, Integer> numberMap = new HashMap<>();
        for (int x = 0; x < numbers.length; x++) {
            int comp = target - numbers[x];
            if (numberMap.containsKey(comp)) {
                return new int[] { numberMap.get(comp), x};
            } else {
                numberMap.put(numbers[x], x);
            }
        }
        return new int[] {};
    }
}