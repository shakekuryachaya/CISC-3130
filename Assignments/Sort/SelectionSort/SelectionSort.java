//this program is for the selection sort
public class Sort {
	public static void main (String[] args) {
            
                //array numbers
		int[] arrayone = {-10, -5, 6, -2, -1, 2, -3, 1, 12, 0, 10};
                
                //prints the initial values in the array first
		System.out.println ("For selection sort, the sorting steps are: ");
		SelectionSort (arrayone);
                
                //prints the sorted area after the selection sort is done
		System.out.print ("\nThe sorted array after selection sort is: ");
		for (int init = 0; init < arrayone.length; init++) {
        	System.out.print (arrayone[init] + " ");                          
        }	
                System.out.println ("\n\nSuccess! Your program works.");
}
	//selection sort method
	public static void SelectionSort (int array[])   {
        int y = array.length;
  
        //find the minimum element in the unsorted array
        for (int x = 0; x < y - 1; x++) {
            int minimum_index = x;
            for (int z = x + 1; z < y; z++)
                if (array[z] < array[minimum_index])
                    minimum_index = z;
             
            int temp = array[minimum_index];
            array[minimum_index] = array[x];
            array[x] = temp;
            
            for (int init = 0; init < array.length; init++)  {
            	System.out.print(array[init] + " ");
            }
            System.out.println();
        }
    }
}
	