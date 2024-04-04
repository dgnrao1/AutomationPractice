package Day.Array;

public class aaa {

	public static void main(String[] args) {
		int a[] = { 2, 3, 6, 1 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];

			}
		}
		System.out.println("max num is:" + max);
	}

}
