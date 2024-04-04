package Day.Array;

class TestArray {
	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("Min number in Arrayis:" + min);
	}

	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("Max number in Arrayis:" + max);

	}
}

public class MethodArray {

	public static void main(String[] args) {

		int a[] = { 10, 23, 2, 34 };
		TestArray.min(a);//passing array to method
		TestArray.max(a);//passing array to method

	}

}
