package String.Assignment;

public class ReverseWordInString {

	public static void main(String[] args) {
		String s1 = "Nagarjuna Gokul Lithansh";
		System.out.println("Actual String:" + s1);
		String[] strAry = s1.split(" ");
		
		String reverseWord = "";
		for (String w : strAry) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		System.out.println("************************************");
		System.out.println("Split the string:" + reverseWord);

	}
}
