package Array.Assignment;

import java.util.*;

public class SortElementsInDecending {

	public static void main(String[] args) {

		// Initializing the array
		Integer array[] = { 1, 2, 3, 4, 5 };
		System.out.println("Elements of original array: ");    
        for (int i = 0; i < array.length; i++) {     
           System.out.print(array[i]+" ");  
           
        } 
        System.out.println("Elements of Reverse array: ");  
		// Sorting the array in descending order
		Arrays.sort(array, Collections.reverseOrder());

		// Printing the elements
		System.out.println(Arrays.toString(array));

	}

}
