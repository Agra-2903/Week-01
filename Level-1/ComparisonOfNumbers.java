// check whether a number is positive, negative, or zero. If number is positive, then check if the number is even or odd. Also, compare the first and last element of the array
import java.util.*;

class ComparisonOfNumbers{
	public static void main(String[]args){
	    // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Declare the 1D Array
		int[] numbers = new int[5];
        System.out.println("Enter any five numbers");
        
		// Input the numbers in the 1D Array
		for(int i=0; i<5; i++){
			numbers[i] = input.nextInt();
			
			// Check whether the number is positive, negative or zero
			if(numbers[i] >= 1){
			    // Check number is even or odd
				if(numbers[i] % 2 == 0){
					System.out.println(numbers[i] + " is positive and even");
				}
				else{
					System.out.println(numbers[i] + " is positive and odd");
				}
			}
			else if(numbers[i] == 0){
				System.out.println(numbers[i] + " is zero");
			}
			else{
				System.out.println(numbers[i] + " is negative");
			}
		}
		
		// Comparing the first and last element of the array is greater, less or equal
		if(numbers[0] == numbers[numbers.length - 1]){
			System.out.println("First and last element is equal");
		}
		else if(numbers[0] > numbers[numbers.length - 1]){
			System.out.println("First element is greater than last element");
		}
		else{
			System.out.println("First element is less than last element");
		}
		
		// Close the Scanner Object
		input.close();
	}
}