package day2.variableexample;

import Encapsulation.Examples.PublicExample;

public class PublicCallingFromAnotherPackage {

	public static void main(String[] args) {

		PublicExample p=new PublicExample();
		System.out.println("Access Public Members Out Side The Package");
		System.out.println(p.accNum);
		p.displayAccNum();
	

	}

}
class Lithansh
{
	public static void main(String[] args) {

		PublicExample p=new PublicExample();
		System.out.println("Access Public Members Out Side The Package");
		System.out.println(p.accNum);
		p.displayAccNum();
	
	}
}
