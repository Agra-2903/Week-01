// Calculate the number of chocolates each child will get and also the remaining chocolates
import java.util.*;

class ChocoDistribution{
	
	// Calculate number of chocolate left and number of chocolate distributed to each children
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int[] arr = new int[2];
		
		arr[0] = number % divisor;
		arr[1] = number / divisor;
		
		return arr;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Input number of chocolates and number of children
		System.out.println("Enter number of chocolates");
		int dividend = input.nextInt();
		System.out.println("Enter number of children");
		int divisor = input.nextInt();
		
		// Stores smallest number first and then largest number
		int[] remainderQuotient = new int[2];
		remainderQuotient = findRemainderAndQuotient(dividend, divisor);
		
		System.out.println("Number of chocolate remain are " + remainderQuotient[0] + " and chocolate distributed to each children are " + remainderQuotient[1]);
        		
        // Close the Scanner Object
		input.close();
	}
}