import java.util.*;

class NullException{
	
	// Method to demonstrate NullPointerException
	public static void demonstrateException(){
	    String text = null;
		try{
			System.out.println(text.length());
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer exception handled");
		}
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        //Scanner input = new Scanner(System.in);
		
		demonstrateException();
        		
        // Close the Scanner Object
		//input.close();
	}
}