// Check whether a number is positive, negative, or zero.
import java.util.*;

class CheckSign{
	
	// Checking whether the number is positive, negative or zero and returning 1, -1 and 0 accordingly
	int checking(int num){
		if(num < 0){
			return -1;
		}
		else if(num > 0){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Input the number
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		CheckSign obj = new CheckSign();
		
		// Passing values to the function and storing return value in a variable
		int check = obj.checking(number);
		
		// Displaying whether number is positive, negative or zero
		if(check == -1){
			System.out.println("Number is negative");
		}
		else if(check == 1){
			System.out.println("Number is positive");
		}
		else{
			System.out.println("Number is zero");
		}
        		
        // Close the Scanner Object
		input.close();
	}
}