import java.util.*;

class CountVowels{
	
	// Method to count vowels and consonants
	public static void countVowelsAndConsonants(String str){
	    int vowelsCount = 0;
		int consonantsCount = 0;
		for(int i=0; i<str.length(); i++){
			if((str.charAt(i) == 'a') || (str.charAt(i) == 'A')){
				vowelsCount++;
			}
			else if((str.charAt(i) == 'e') || (str.charAt(i) == 'E')){
				vowelsCount++;
			}
			else if((str.charAt(i) == 'i') || (str.charAt(i) == 'I')){
				vowelsCount++;
			}
			else if((str.charAt(i) == 'o') || (str.charAt(i) == 'O')){
				vowelsCount++;
			}
			else if((str.charAt(i) == 'u') || (str.charAt(i) == 'U')){
				vowelsCount++;
			}
			else{
				consonantsCount++;
			}
		}
		
		System.out.println("Number of vowels is " + vowelsCount + " and number of consonants is " + consonantsCount);
	}
	
	public static void main(String[]args){
		
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.next();
		
		countVowelsAndConsonants(string);
		
        // Close the Scanner Object
		input.close();
	}
	}	