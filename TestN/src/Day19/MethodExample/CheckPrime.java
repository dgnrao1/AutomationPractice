package Day19.MethodExample;

public class CheckPrime {

	public static void main(String[] args) {
		int n1 = 4;
		System.out.println("Num is" + n1);
		System.out.println("Num is Prime?" + checkPrime(4));

	}

	static boolean checkPrime(int num) {
		boolean result = false;
		int ct = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				ct++;
				if (ct == 2) {
					result = true;
				} else
					result = false;
			}

		}
		return result;

	}

}
