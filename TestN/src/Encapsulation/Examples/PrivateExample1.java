package Encapsulation.Examples;

public class PrivateExample1 {
private int accNum=12345;
private void displayAccNum()
{
	System.out.println("Account Number:"+accNum);
}
	public static void main(String[] args) {
		PrivateExample1 p=new PrivateExample1();
		System.out.println(+p.accNum);
		p.displayAccNum();

	}

}
