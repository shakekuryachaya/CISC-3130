//QuickSort is a Divide and Conquer algorithm
//It picks an element as pivot and partitions the given array around the picked pivot
public class QuickSort  {
    public static void main (String[] args)  {
        
        int[] arrayfour = {-10, -5, 6, -2, -1, 2, -3, 1, 12, 0, 10};
                    QuickSort (arrayfour, 0, arrayfour.length - 1);
                    System.out.print ("\n\nThe sorted array after quick sort is: ");
                    
                    for (int init = 0; init < arrayfour.length; init++) {
                    System.out.print (arrayfour[init] + " ");
        }
                    System.out.println ("\n\nSuccess! Your program works.");
    }
        //quick sort method
	public static void QuickSort (int array[], int start, int end) {
            
            //start is the starting index, end is the ending index
	    if (start < end) {
                
                //pi is a partitioning index
	        int pi = partition (array, start, end);

	        QuickSort (array, start, pi - 1); //before pi
	        QuickSort (array, pi + 1, end);  }  //after pi
	}
        
	private static int partition (int array[], int start, int end) {
	    int pivot = array[end];
	    int x = (start - 1);

            //figures out if the current element is smaller than the pivot
	    for (int y = start; y < end; y++) {
	        if (array[y] <= pivot) {
	            x++;

	            int swap = array[x];
	            array[y] = array[y];
	            array[y] = swap;  }
	    }
	    int swap = array[x + 1];
	    array[x + 1] = array[end];
	    array[end] = swap;

	    return x + 1;
	}
    }