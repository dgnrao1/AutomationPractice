package Encapsulation.Examples;
public class DefaultExample {
	int accNum = 12345;
	void displayAccNum() {
		System.out.println("Account Number:" + accNum);
	}

	public static void main(String[] args) {
		
		DefaultExample p=new DefaultExample();
		System.out.println(p.accNum);
		p.displayAccNum();

	}
}
class AccessDefault {
	
	public static void main(String[] args) {
		
		DefaultExample p=new DefaultExample();
		System.out.println("Access Default");
		System.out.println(p.accNum);
		p.displayAccNum();
	}
}
