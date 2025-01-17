import java.util.*;

class CheckPalindromeString{
	
	// Method to check whether string is palindrome or not
	public static boolean isPalindrome(String str){
		for(int i=0; i<str.length()/2; i++){
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.next();
		
		if(isPalindrome(string)){
			System.out.println("String is a palindrome string");
		}
		else{
			System.out.println("String is not a palindrome string");
		}
        		
        // Close the Scanner Object
		input.close();
	}
}