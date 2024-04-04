package Day.Array;

import java.util.Arrays;

public class CopyElements {

	public static void main(String[] args) {
		char[] copyFrom = { 'a', 'b', 'd', 's', 'f', 'g', 'h', 'k' };
		System.out.println("Elements count in copyFrom array: " + copyFrom.length);
		char[] copyTo = Arrays.copyOf(copyFrom, 4);
		System.out.println("Elements count in copyTo array: " + copyTo.length);
		for (int i = 0; i < copyTo.length; i++) {
			System.out.print(copyTo[i] + "  ");
		}
		System.out.println("********Copy using range**************");

		char[] copyWithRange = Arrays.copyOfRange(copyFrom, 2, 5);

		for (int i = 0; i < copyWithRange.length; i++) {
			System.out.print(copyWithRange[i] + " ");
		}
		System.out.println("********After sorting**************");
		Arrays.sort(copyFrom);// Elements in ascending
		for (char c : copyFrom) {
			System.out.print(c + " ");

		}
	}
}
