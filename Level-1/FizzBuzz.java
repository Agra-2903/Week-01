// FizzBuzz program
import java.util.*;

class FizzBuzz{
	public static void main(String[]args){
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = input.nextInt();
		
        // Declare the 1D Array
		String[] array = new String[number];
        
		// Checking and storing FizzBuzz and numbers in an array
        for(int i=1; i<=number; i++){
			if((i % 3 == 0) && (i % 5 == 0)){
				array[i-1] = "FizzBuzz";
			}
			else if(i % 3 == 0){
				array[i-1] = "Fizz";
			}
			else if(i % 5 == 0){
				array[i-1] = "Buzz";
			}
			else{
				array[i-1] = String.valueOf(i);
			}
		}
		
		for(int i=1; i<=number; i++){
			System.out.println("Position " + i + " = " + array[i-1]);
		}

		
        // Close the Scanner Object
		input.close();
	}
}