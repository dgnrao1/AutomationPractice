package Day12.PracticeForLoop;

public class FactosOfANumber {

	public static void main(String[] args) {

		int num = 10;

		System.out.println("Factors of are " + num);

		// finding and printing factors b/w 1 to num
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				// System.out.println( "Factors of A Number"+i);
				System.out.println(i);
		}

	}
}
