package Encapsulation.Examples;

public class ProtectedExample {
	protected int accNum = 12345;
	protected void displayAccNum() {
		System.out.println("Account Number:" + accNum);
	}

	public static void main(String[] args) {
		
		ProtectedExample p=new ProtectedExample();
		System.out.println(p.accNum);
		p.displayAccNum();

	}
}
class AccessProtectedEx {
	
	public static void main(String[] args) {
		
		ProtectedExample p=new ProtectedExample();
		System.out.println("Access Protected members another class");
		System.out.println(p.accNum);
		p.displayAccNum();
	}
}
	