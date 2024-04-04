package Day.Exception;

public class Exception {

	public static void main(String[] args) {
		try {
			System.out.println("Inside the try block");
			int data=25/5;
			System.exit(0);
			System.out.println(data);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Iam inside the finally block");
			int k=10/0;
			System.out.println("Finally block is always Executed");
		}
System.out.println("Rest of the code");
	}

}
