import java.util.*;

class CreateCharArray{
	
	// Method to create character array
	public static char[] createCharArray(String str){
		char[] arr = new char[str.length()];
		for(int i=0; i<str.length(); i++){
			arr[i] = str.charAt(i);
		}
		
		return arr;
	}
	
	public static boolean arrayCheck(char[] arr1, char[] arr2){
		for(int i=0; i<arr1.length; i++){
			if(arr1[i] != arr2[i]){
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
		
		char[] charArray1 = createCharArray(string);
		char[] charArray2 = string.toCharArray();
		
		if(arrayCheck(charArray1, charArray2)){
			System.out.println("Arrays are same");
		}
		else{
			System.out.println("Arrays are not same");
		}
		
        		
        // Close the Scanner Object
		input.close();
	}
}