// Calculate remainder and quotient of two numbers
import java.util.*;

class DivisionProgram{
	
	// Calculate remainder and quotient
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int[] arr = new int[2];
		
		arr[0] = number % divisor;
		arr[1] = number / divisor;
		
		return arr;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Input dividend and divisor
		System.out.println("Enter dividend");
		int dividend = input.nextInt();
		System.out.println("Enter divisor except 0");
		int divisor = input.nextInt();
		
		// Stores smallest number first and then largest number
		int[] remainderQuotient = new int[2];
		remainderQuotient = findRemainderAndQuotient(dividend, divisor);
		
		System.out.println("Remainder is " + remainderQuotient[0] + " and quotient is " + remainderQuotient[1]);
        		
        // Close the Scanner Object
		input.close();
	}
}