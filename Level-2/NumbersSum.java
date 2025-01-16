//  Find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2
import java.util.*;

class NumbersSum{
	
	// Method to find the sum of the natural numbers recursively
	int findSumRecursively(int num){
		if(num == 1){
			return 1;
		}
		
		return num + findSumRecursively(num - 1);
	}
	
	// Method to find the sum of numbers using formula
	int findSumByFormula(int num){
		int sum = (num * (num + 1)) / 2;
		
		return sum;
	}
	
	public static void main(String[]args){
		
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		// Check whether number is natural number or not
		if(number > 0){
			NumbersSum obj = new NumbersSum();
			int sum1 = obj.findSumRecursively(number);
			int sum2 = obj.findSumByFormula(number);
			
			System.out.println("Sum of numbers using recursion is " + sum1 + " and sum by formula is " + sum2);
		}
		else{
			System.out.println("Not a natural number");
		}
		
        // Close the Scanner Object
		input.close();
	}
}