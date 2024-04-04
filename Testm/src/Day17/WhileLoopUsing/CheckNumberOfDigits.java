package Day17.WhileLoopUsing;

public class CheckNumberOfDigits {

	public static void main(String[] args) {

		int num = 123, ct = 0;
		while (num != 0) {
			ct++;
			System.out.println("Number of digits="+ ct);
			num = num / 10;
		}

	}

}
