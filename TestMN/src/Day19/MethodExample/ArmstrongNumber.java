package Day19.MethodExample;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
	
		System.out.println("Num is Armstrong?"+armstrong(123));
		System.out.println("Num is Armstrong?"+armstrong(153));
	}
	static boolean armstrong(int n) {
		boolean result = false;
		int arm = 0, temp, a;
		temp = n;
		while (n != 0) {
			a = n % 10;
			arm = arm + (a * a * a);
			n = n / 10;
		}
		if (arm == temp) {
			result = true;

		} else {
			result = false;
		}
		return result;

	}
}