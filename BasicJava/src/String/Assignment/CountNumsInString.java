package String.Assignment;

public class CountNumsInString {

	public static void main(String[] args) {
		String str = "Geeks6forGeeks p123assword is 457: 1234";
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {//Ais65,ais97
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)//ASCII value of 0is48 to 9is 57
                digits++;
        }
        System.out.println("Total number of Digits = "
                           + digits);
    }

	}


