package String.Assignment;

public class FindDuplicateChars {

	public static void main(String[] args) {
	  String string1 ="Better Butter";  
	        int count;  
	       // string1=string1.toLowerCase();
	        //Converts given string into character array  
	        char string[] = string1.toCharArray();  
	          
	        System.out.println("Duplicate characters in a given string: ");  
	        //Counts each character present in the string  
	        for(int i = 0; i <string.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <string.length; j++) {  
	                if(string[i] == string[j])
	                { count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	            //A character is considered as duplicate if count is greater than 1  
	           if(count > 1 && string[i] != '0')  
	              System.out.println(string[i]+":"+count+"Times");  
	        }  
		
	      
	}

}
