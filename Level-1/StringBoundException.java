import java.util.*;

class StringBoundException{
	
	// Method to demonstrate StringIndexOutOfBoundsException
	public static void demonstrateException(String str){
		try{
			for(int i=0; i<=str.length(); i++){
				System.out.println(str.charAt(i));
			}
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("String Index Out Of Bounds exception handled");
		}
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.next();
		
		demonstrateException(string);
        		
        // Close the Scanner Object
		//input.close();
	}
}