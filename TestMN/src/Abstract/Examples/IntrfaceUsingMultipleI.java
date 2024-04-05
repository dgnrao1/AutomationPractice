package Abstract.Examples;
interface AccountCreation
{int age=23;
	void signup();
}
interface GetInsideTheApplication
{
	void login();
}
public class IntrfaceUsingMultipleI implements AccountCreation,GetInsideTheApplication{
	public static int age=33;
	public void signup()
	{
		System.out.println("Your Account Created Successfully.....");
	}
	public void login()
	{
		System.out.println("Login Successfully.....");
	}
	public static void main(String[] args) {
		IntrfaceUsingMultipleI  i=new IntrfaceUsingMultipleI ();
		i.signup();
		i.login();
		System.out.println("Interface age:"+AccountCreation.age);
		System.out.println("Class age:"+IntrfaceUsingMultipleI.age);
	}

}
