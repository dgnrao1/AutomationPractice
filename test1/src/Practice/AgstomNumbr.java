package Practice;

public class AgstomNumbr {

	public static void main(String[] args) {
		int n = 152, rem, arm = 0, t = n;
		System.out.println("Num  is:" + n);
		for (; n != 0; n = n / 10) {
			rem = n % 10;
			arm = arm + (rem * rem * rem);
		}
		if (arm == t) {
			System.out.println("Num is arm");
		} else {
			System.out.println("Num is not Arm");

		}
	}

}
