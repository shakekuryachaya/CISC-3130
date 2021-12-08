public class InsertionSort  {
    
	public static void main(String[] args)  {
                int[] arraytwo = {-10, -5, 6, -2, -1, 2, -3, 1, 12, 0, 10};
                    System.out.println ("\n\nFor insertion sort, the sorting steps are: ");
                    InsertionSort (arraytwo);
                    
                    System.out.print ("\nThe sorted array after insertion sort is: ");
                    for (int init = 0; init < arraytwo.length; init++) {
                    System.out.print (arraytwo[init] + " ");
        }	
                    System.out.println ("\n\nSuccess! Your program works.");
    }       
            //insertion sort method
            public static void InsertionSort(int array[])   {
            int y = array.length;
            for (int x = 1; x < y; ++x) {
                int key = array[x];
                int z = x - 1;
 
                //moves elements greater than key to the positon ahead of their current one
                while (z >= 0 && array[z] > key) {
                    array[z + 1] = array[z];
                    z = z - 1;  
    }
                array[z + 1] = key;
                
                //prints the array of size array
                for(int init = 0; init < array.length; init++) {
                    System.out.print (array[init] + " ");
                }
                System.out.println();
            }
        }
}