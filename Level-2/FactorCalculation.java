// Find the factors of a number and also find the sum, sum of square of factors and product of the factors
import java.util.*;

class FactorCalculation{
	
	// Method to find factors of the number
	public static int[] findFactors(int num){
	    int count = 0;
		for(int i=1; i<=num; i++){
			if(num % i == 0){
				count++;
			}
		}
		
		int[] factors = new int[count];
		
		int j = 0;
		for(int i=1; i<=num; i++){
			if(num % i == 0){
				factors[j] = i;
				j++;
			}
		}
		
		return factors;
	}
	
	// Method to find sum of the factors
	int findSum(int[] arr){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		return sum;
	}
	
	// Method to find product of the factors
	int findProduct(int[] arr){
		int product = 0;
		for(int i=0; i<arr.length; i++){
			product *= arr[i];
		}
		
		return product;
	}
	
	// Method to find sum of square of factors
	int findSquaredSum(int[] arr){
		int ss = 0;
		for(int i=0; i<arr.length; i++){
			ss = ss + (int)Math.pow(arr[i], 2);
		}
		
		return ss;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		FactorCalculation obj = new FactorCalculation();
		int[] factors = findFactors(number);
		int sum = obj.findSum(factors);
		int product = obj.findProduct(factors);
		int squaredSum = obj.findSquaredSum(factors);
		
		// Displaying results
		System.out.println("Factors of the number are: ");
		for(int i=0; i<factors.length; i++){
			System.out.println(factors[i]);
		}
		
		System.out.println("Sum of factors is " + sum + ", product of factors is " + product + " and squared Sum of factors is " + squaredSum);
        		
        // Close the Scanner Object
		input.close();
	}
}