package Day12.PracticeForLoop;

public class ReverseOfANumber {

	public static void main(String[] args) {

		int number = 12321, reverse;
		// we have not mentioned the initialization part of the for loop
		for (reverse = 0; number != 0; number = number / 10) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given number is: " + reverse);

		
		}
	}

