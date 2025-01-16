// Find the smallest and the largest of the 3 numbers
import java.util.*;

class SmallestLargest{
	
	// Finding smallest and largest number among three
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		// Stores smallest number first and then largest number
		int[] arr = new int[2];
		
		if((number1 <= number2) && (number1 <= number3)){
			arr[0] = number1;
		}
		else if((number2 <= number1) && (number2 <= number3)){
			arr[0] = number2;
		}
		else{
			arr[0] = number3;
		}
		
		if((number1 >= number2) && (number1 >= number3)){
			arr[1] = number1;
		}
		else if((number2 >= number1) && (number2 >= number3)){
			arr[1] = number2;
		}
		else{
			arr[1] = number3;
		}
		
		return arr;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Input three numbers
		System.out.println("Enter three numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		// Stores smallest number first and then largest number
		int[] smallestLargest = new int[2];
		smallestLargest = findSmallestAndLargest(num1, num2, num3);
        
		System.out.println("Smallest number is " + smallestLargest[0] + " and largest number is " + smallestLargest[1]);
		
        // Close the Scanner Object
		input.close();
	}
}