package Array.Assignment;

import java.util.Arrays;
import java.util.Collections;

public class PrintTheElementsOfArray {

	public static void main(String[] args) {
		
		double sum=0;
		int arr1[]= {1,2,3,6,5,4};
		System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr1.length; i++) {     
	           System.out.print(arr1[i]+" ");  
	           
	        }  
	        System.out.println("Elements of Reverse array: ");  
	        for(int i= arr1.length-1; i>=0; i--)
	        {
	        	 System.out.print(arr1[i]+" ");  
	        }
	       System.out.println( "Elements of given array present on even position:");
	        for(int i=1; i< arr1.length; i= i+2)
	        {
	        	 System.out.print(arr1[i]+" ");  
	}
	  System.out.println( "Elements of given array present on odd position:");
      for(int i=1; i< arr1.length; i= i+2)
      {
      	 System.out.print(arr1[i]+" "); 

} System.out.println( "Largest element in given array:");
int max = arr1[0];
for (int i = 1; i < arr1.length; i++) {
	if (max < arr1[i]) {
		max = arr1[i];
	}}
	 System.out.println( "Largest element in given array:"+max);

	System.out.println( "Smallest element in given array:");
	int min = arr1[0];
	for (int i = 1; i < arr1.length; i++) {
		if (min > arr1[i]) {
			min = arr1[i];
		}}
		 System.out.println( "Smallest element in given array:"+min);
  
	
	for(int n:arr1)
	{
		sum+=n;
	}
	 System.out.println( "Sum of elements in given array:"+sum);
	 System.out.println("********After sorting**************");
		Arrays.sort(arr1);// Elements in ascending
		for (int c : arr1) {
			System.out.print(c + " ");
			
			
}
	
}
}

      