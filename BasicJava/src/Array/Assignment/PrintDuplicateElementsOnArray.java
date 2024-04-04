package Array.Assignment;

public class PrintDuplicateElementsOnArray {

	public static void main(String[] args) {

		int array[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		for (int n : array) {
			System.out.print(n + "  ");

		}
		System.out.println("Printing clone of the array:");
		int cloneArray[] = array.clone();
		for (int n : cloneArray) {
			System.out.print(n + "  ");

		}

	}
}
