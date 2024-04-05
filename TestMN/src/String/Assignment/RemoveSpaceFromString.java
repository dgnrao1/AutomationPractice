package String.Assignment;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		String s4="     I am Gokul         ";
		System.out.println("Actual String with spaces: "+s4);
		System.out.println("Actual String length: "+s4.length());//24
		System.out.println("Actual String without spaces: "+s4.trim());
		System.out.println("Actual String length without spaces: "+s4.trim().length());//10
		System.out.println("***************************");
		String s5="I    am       NagGokulLithansh        ";
		System.out.println("Actual String with spaces: "+s5.trim());
		System.out.println("Actual String length: "+s5.trim().length());

	}

}
