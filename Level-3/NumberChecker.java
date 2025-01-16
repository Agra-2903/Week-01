import java.util.*;

class NumberChecker{
	
	// Method to count the digits in a number
	public static int countDigits(int num){
		int count = 0;
		while(num != 0){
			num /= 10;
			count++;
		}
		
		return count;
	}
	
	// Method to store digits of the number in an array
	public static int[] createArray(int num, int n){
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = num % 10;
			num /= 10;
		}
		
		return arr;
	}
	
	// Method to check whether number is a duck number or not
	public static void checkDuckNumber(int[] arr){
	    boolean isDuck = true;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == 0){
				isDuck = false;
				break;
			}
		}
		
		if(isDuck){
			System.out.println("Number is a Duck number");
		}
		else{
			System.out.println("Number is not a Duck number");
		}
	}
	
	// Method to check whether number is a armstrong number or not
	public static void checkArmstrongNumber(int[] arr, int num){
	    int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += Math.pow(arr[i], 3);
		}
		
		if(sum == num){
			System.out.println("Number is an Armstrong number");
		}
		else{
			System.out.println("Number is not an Armstrong number");
		}
	}
	
	// Method to find first and second largest digit
	public static void findFirstSecondLargest(int[] arr){
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			if(largest < arr[i]){
			    secondLargest = largest;
				largest = arr[i];
			}
			else if((secondLargest < arr[i]) && (largest != arr[i])){
				secondLargest = arr[i];
			}
		}
		
		System.out.println("First largest number is " + largest + " and second largest number is " + secondLargest);

	}
	
	// Method to find first and second smallest digit
	public static void findFirstSecondSmallest(int[] arr){
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++){
			if(smallest > arr[i]){
			    secondSmallest = smallest;
				smallest = arr[i];
			}
			else if((secondSmallest > arr[i]) && (smallest != arr[i])){
				secondSmallest = arr[i];
			}
		}
		
		System.out.println("First smallest number is " + smallest + " and second smallest number is " + secondSmallest);

	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		int count = countDigits(number);
		int[] digitsArray = createArray(number, count);
		checkDuckNumber(digitsArray);
		checkArmstrongNumber(digitsArray, number);
		findFirstSecondLargest(digitsArray);
		findFirstSecondSmallest(digitsArray);
        		
        // Close the Scanner Object
		input.close();
	}
}