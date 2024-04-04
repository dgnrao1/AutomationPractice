package day2.variableexample;


public class FullyQualifiedExample {

	public static void main(String[] args) {
		Encapsulation.Examples.PublicExample p=new Encapsulation.Examples.PublicExample();
		System.out.println("Access Public Members Out Side The Package");
		System.out.println(p.accNum);
		p.displayAccNum();
		//Encapsulation.Examples.PublicExample p2=new Encapsulation.Examples.PublicExample();
	}

}
