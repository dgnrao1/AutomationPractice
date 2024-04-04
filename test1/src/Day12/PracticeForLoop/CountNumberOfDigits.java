package Day12.PracticeForLoop;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int  num = 12345,count;

		for (count=0; num != 0; num /= 10) {
			 ++count;
		}

		System.out.println("Number of digits: " + count);
	}

}
