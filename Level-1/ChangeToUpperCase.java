import java.util.*;

class ChangeToUpperCase{
	
	// Method to change string to upper case
	public static String changeToUpperCase(String str){
	    String str2 = "";
		for(int i=0; i<str.length(); i++){
			if((str.charAt(i) >= 97) && (str.charAt(i) <= 122)){
			    str2 = str2 + (char)(str.charAt(i) - 32);
			}
			else{
				str2 += str.charAt(i);
			}
		}
		
		return str2;
	}
	
	// Method to compare two strings
	public static boolean stringCheck(String str1, String str2){
		for(int i=0; i<str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.nextLine();
		
		String upperCaseString1 = changeToUpperCase(string);
		String upperCaseString2 = string.toUpperCase();
		
		if(stringCheck(upperCaseString1, upperCaseString2)){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not equal");
		}
		
        		
        // Close the Scanner Object
		input.close();
	}
}