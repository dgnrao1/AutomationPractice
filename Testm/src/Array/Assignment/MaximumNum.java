package Array.Assignment;

public class MaximumNum {

	public static void main(String[] args) {
		int[] arr = { 12, 31, 58, 10 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max<arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println("Max num is:"+max);
	}
}