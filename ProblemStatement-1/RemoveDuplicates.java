import java.util.*;

class RemoveDuplicates{
	
	// Method to remove the duplicate character from the string
	public static String removeDuplicates(String str){
		String resultString = "";
		resultString += str.charAt(0);
		
		for(int i=1; i<str.length(); i++){
			char currentChar = str.charAt(i);
			boolean isDuplicate = false;
			
			for(int j=0; j<resultString.length(); j++){
				if(resultString.charAt(j) == currentChar){
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate){
				resultString += currentChar;
			}
		}
		
		return resultString;
		
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.next();
		
		String newString = removeDuplicates(string);
		
		System.out.println("Duplicate removed string: " + newString);
        		
        // Close the Scanner Object
		input.close();
	}
}