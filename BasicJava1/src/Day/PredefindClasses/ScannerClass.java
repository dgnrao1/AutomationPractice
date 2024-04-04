package Day.PredefindClasses;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Plz Enter Number1");
		int n1 = scr.nextInt();
		System.out.println("Plz Enter Number2");
		int n2 = scr.nextInt();
		System.out.println("Plz Enter Operator");
		char op = scr.next().charAt(0);
		performOperatin(op, n1, n2);

	}

	static void performOperatin(int ops, int num1, int num2) {
		int res=0;
		System.out.println("Number1:" + num1);
		System.out.println("Number2:" + num2);
		if (ops == '+') {
			res = num1 + num2;

		} else if (ops == '-') {
			res = num1 - num2;
		} else if (ops == '*') {
			res = num1 * num2;
		} else if (ops == '/') {
			res = num1 / num2;

		}
		System.out.println("Result:"+res);

	}
}
