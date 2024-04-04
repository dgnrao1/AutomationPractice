package Day.Array;

import java.net.Socket;

public class ArrayExample {

	public static void main(String[] args) {

		int a[] = new int[5];// declaration &instantiation
		//or
		//int a1[] = new int[] {10,20,30,40,50};
		//or
			int a2[]= {10,20,30,40,50};

		/*a[0] = 10;// Initialization
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;*/
		/*
		 * System.out.println(a[0]); System.out.println(a[1]); System.out.println(a[2]);
		 * System.out.println(a[3]); System.out.println(a[4]);
		 */
//or
		System.out.println("Array Element Count:" + a2.length);// 5
		System.out.println("Array using for loop");
		for (int i = 0; i < a2.length; i++) {
			//System.out.println(a2[i]);
if(a2[i]==20)
{
	System.out.println("Hi Iam Twenty:"+a2[i]);
	break;
}

		}
		System.out.println("********for each loop");
		for (int num : a2) {
			if(num==20)
			{
			System.out.println(num);
			break;
		}}
		//char getArray[] = new char[] { 'A', 'B', 'C', 'D' };
//or
		/*char getArray1[] = new char[4];
		getArray1[0] = 'A';
		getArray1[1] = 'B';
		getArray1[2] = 'C';
		getArray1[3] = 'D';*/
		System.out.println("*********************************");
		//or
		char b[] = { 'A', 'B', 'C', 'D' };
		System.out.println("********for each loop");
		for (char num1 :b) {
			System.out.println(num1);
		

	}
		for(char num2:b) {
			if(num2=='B')
			{
				System.out.println("Hi Iam is b:"+num2);
				break;
			}
		}
}
	}

