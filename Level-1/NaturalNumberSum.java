// Sum of n natural numbers using loop
import java.util.*;

class NaturalNumberSum{
	
	// Sum up of natural numbers using for loop
	int addingNumber(int num){
	int result = 0;
		for(int i=1; i<=num; i++){
			result += i;
		}
		return result;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Input the number
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		NaturalNumberSum obj = new NaturalNumberSum();
		
		// Passing values to the function and storing return value in a variable
		int sum = obj.addingNumber(number);
		
		System.out.println("Sum of natural numbers is " + sum);
        		
        // Close the Scanner Object
		input.close();
	}
}