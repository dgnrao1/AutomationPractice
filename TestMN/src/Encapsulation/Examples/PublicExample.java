package Encapsulation.Examples;

public class PublicExample {
	public int accNum = 12345;
	public void displayAccNum() {
		System.out.println("Account Number:" + accNum);
	}

	public static void main(String[] args) {
		
		PublicExample p=new PublicExample();
		System.out.println("Access Public Members inside Side Class");
		System.out.println(p.accNum);
		p.displayAccNum();

	}
}
class AccessPublic {
	
	public static void main(String[] args) {
		
		PublicExample p=new PublicExample();
		System.out.println("Access Public Members Out Side Class");
		System.out.println(p.accNum);
		p.displayAccNum();
	
		

	}

}
