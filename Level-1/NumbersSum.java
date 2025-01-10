// Program to store multiple values in an array up to a maximum of 10. Print the numbers of the array and sum of it.
import java.util.*;

class NumbersSum{
	public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
		
        // Declaring the 1D Array
		double[] numbers = new double[10];
		double sum = 0.0;
		int index = 0;
        
		// Input number in the array
		System.out.println("Enter the numbers");
        while(true){
		    if(index == 10){
				break;
			}
			
			double number = input.nextDouble();
			
			// Check condition to break the loop
			if(number <= 0){
				break;
			}
			
			numbers[index] = number;
			index++;
		}
		
		// Calculate sum of the numbers
		for(int i=0; i<index; i++){
			sum += numbers[i];
		}
		
		System.out.println("Sum of the numbers is " + sum);
		
        // Close the Scanner Object
		input.close();
	}
}