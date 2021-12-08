public class MergeSort {
    
	public static void main (String[] args)  {
            int[] arraythree = {-10, -5, 6, -2, -1, 2, -3, 1, 12, 0, 10};
		MergeSort (arraythree, 0, arraythree.length - 1);
		System.out.print ("\n\nThe sorted array after merge sort is: ");
                
		for(int init = 0; init < arraythree.length; init++) {
        	System.out.print (arraythree[init] + " ");
        }
                System.out.println ("\n\nSuccess! Your program works.");
    }

        //merge sort method
	public static void MergeSort (int array[], int a, int c)   {
        if (a < c) {
            int b = a + (c - a) / 2;
             
        MergeSort (array, a, b);
        MergeSort (array, b + 1, c);
        merge (array, a, b, c);   }            
}
	public static void merge (int array[], int a, int b, int c)  {
        //find sizes of two subarrays to be merged
        int one = b - a + 1;
        int two = c - b;
 
        //temporary arrays created
        int A[] = new int[one];
        int C[] = new int[two];
 
        //transfers data to the temporary arrays
        for (int x = 0; x < one; ++x)
            A[x] = array[a + x];
        for (int y = 0; y < two; ++y)
            C[y] = array[b + 1 + y];
  
        //merge the arrays
        //these are the first and second subarrays
        int x = 0, y = 0;
        int z = a;
        while (x < one && y < two)  {
            if (A[x] <= C[y]) {
                array[z] = A[x];
                x++;  }
            else {
                array[z] = C[y];
                y++;  }
            z++;  
        }
 
        while (x < one) {
            array[z] = A[x];
            x++;
            z++;  }
 
        while (y < two) {
            array[z] = C[y];
            y++;
            z++;
        }
    }
}