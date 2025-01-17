import java.util.*;

class CompareStrings{
	
	// Method to compare two strings
	public static boolean stringCheck(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
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
		
		System.out.println("Enter first string");
		String string1 = input.next();
		System.out.println("Enter second string");
		String string2 = input.next();
		
		if(stringCheck(string1, string2)){
			System.out.println("Strings are equal using user-defined method");
		}
		else{
			System.out.println("Strings are not equal using user-defined method");
		}
		
		if(string1.equals(string2)){
			System.out.println("Strings are equal using built-in method");
		}
		else{
			System.out.println("Strings are not equal using built-in method");
		}
		
        		
        // Close the Scanner Object
		input.close();
	}
}