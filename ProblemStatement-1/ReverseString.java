import java.util.*;

class ReverseString{
	
	// Method to reverse the string
	public static String reverseString(String str){
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--){
			revStr += str.charAt(i);
		}
		
		return revStr;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.next();
		
		String reversedString = reverseString(string);
		
		System.out.println("Reversed string is " + reversedString);
        		
        // Close the Scanner Object
		input.close();
	}
}