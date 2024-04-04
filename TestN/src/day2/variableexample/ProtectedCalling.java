package day2.variableexample;

import Encapsulation.Examples.ProtectedExample;

public class ProtectedCalling extends ProtectedExample{

	public static void main(String[] args) {
		ProtectedCalling p1=new ProtectedCalling ();
		System.out.println("Access Protected members another class");
		System.out.println(p1.accNum);
		p1.displayAccNum();

	}

}
