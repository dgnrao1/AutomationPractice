package Day.Array;

import java.util.Arrays;

public class M_Array {

	public static void main(String[] args) {
		int array[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		for (int n : array) {
			System.out.print(n + "  ");

		}
		System.out.println("Printing clone of the array:");//Duplicate of original array
		int cloneArray[] = array.clone();
		for (int n : cloneArray) {
			System.out.print(n + "  ");

		}
		System.out.println("are both equal? ");
		System.out.println("array and cloneArray content validation: " + Arrays.equals(array, cloneArray));
		System.out.println("*****************************");
		int newCopiedArray[] = Arrays.copyOf(array, array.length);
		for (int n : newCopiedArray)
			System.out.println(n + "  ");
		System.out.println("****************Range*************");
		int newCopyedRangeArray[]=Arrays.copyOfRange(newCopiedArray, 1, 3);
		for (int n :newCopyedRangeArray )
			System.out.println(n + "  ");
		Arrays.sort(array);

		System.out.println("After sorting original array:");// Ascending order
		for (int n : array) {
			System.out.print(n + "  ");

		}

	}
}
