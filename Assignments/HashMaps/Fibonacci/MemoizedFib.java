import java.util.*;

import java.util.HashMap;
import java.util.Map;

public class MemoizedFib {
    
    public static int fibonacci (int x) {
        Map<Integer, Integer > memoize = new HashMap < Integer, Integer > ();
        memoize.put(1, 0);
        memoize.put(2,1);
        return fibonacci (x, memoize);
    }

    public static int fibonacci (int x, Map  <Integer, Integer > memoize) {
        if (memoize.containsKey (x)) {
            return memoize.get (x);
        } else {
            memoize.put (x, fibonacci (x - 1, memoize) + fibonacci (x - 2, memoize));
            return memoize.get (x);
        }
}
    public static void main (String[] args) {
        System.out.println (fibonacci(99));  }
}
