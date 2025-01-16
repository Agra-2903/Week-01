// Check whether a number is positive or negative. If the number is positive, then  check if the number is even or odd. Finally compare the first and last elements of the array.
import java.util.*;

class NumberCheck{
	
	// Method to check whether the number is positive or negative
	void isPositive(int number){
		if(number > 0){
			isEven(number);
		}
		else if(number < 0){
			System.out.println("Negative number");
		}
	}
	
	// Method to check whether the number is even or odd
	void isEven(int number){
		if(number % 2 == 0){
			System.out.println("Positive and even number");
		}
		else{
			System.out.println("Positive and odd number");
		}
	}
	
	// Method to compare first and last element of the array
	int compare(int[] numbers){
		int number1 = numbers[0];
		int number2 = numbers[numbers.length - 1];
		
		if(number1 > number2){
			return 1;
		}
		else if(number1 == number2){
			return 0;
		}
		else{
			return -1;
		}
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		NumberCheck obj = new NumberCheck();
		int[] numbers = new int[5];
		for(int i=0; i<5; i++){
			System.out.println("Enter a number");
			numbers[i] = input.nextInt();
			obj.isPositive(numbers[i]);
		}
		
		int comp = obj.compare(numbers);
		
		if(comp == 1){
			System.out.println("First element is greater than last element");
		}
		else if(comp == -1){
			System.out.println("First element is less than last element");
		}
		else{
			System.out.println("First element is equal to last element");
		}
        		
        // Close the Scanner Object
		input.close();
	}
}