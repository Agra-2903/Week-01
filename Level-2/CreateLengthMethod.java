import java.util.*;

class CreateLengthMethod{
	
	// Method to count length of the string
	public static int lengthMethod(String str){
	    int count = 0;
		try{
		    int i=0;
			while(true){
				if(str.charAt(i) != ' '){
					count++;
					i++;
				}
			}
		}
		catch(StringIndexOutOfBoundsException e){
			return count;
		}
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.next();
		
		int stringLength = lengthMethod(string);
		
		System.out.println("Length of the string is " + stringLength);
        		
        // Close the Scanner Object
		input.close();
	}
}