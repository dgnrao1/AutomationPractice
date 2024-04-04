package String.Assignment;

import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		String str1 = "Race";
		String str2 = "Care";
		// check if length is same
		if (str1.length() == str2.length()) {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();

			// convert strings to char array
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			// sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// if sorted char arrays are same
			// then the string is anagram
			if( Arrays.equals(charArray1, charArray2)) {
				System.out.println("Given String is anargam");
			}else {
				
				System.out.println("Given String is not an anagram,all charactors are not same");
			
		}
		}else {
			System.out.println("Given String is not an anagram,length is not same");
		}
		}
}
	


