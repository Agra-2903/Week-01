import java.util.*;

class ArgumentException{
	public static void demonstrateException(String text, int index){
			try{
			if(index>text.length()){
			throw new IllegalArgumentException("Invalid index entered");
			}
			else{
				System.out.println(text.substring(index));
			}
		}
		catch(IllegalArgumentException e){
			System.out.println("Illegal Argument Exception handled");
		}
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String text = input.next();
		System.out.println("Enter end index for creating substring");
		int endIndex = input.nextInt();	
	
		demonstrateException(text, endIndex );
		input.close();
		
	}
}