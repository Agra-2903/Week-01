import java.util.*;

class NumberChecker2{
	
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
	
	public static int calculateSum(int[] arr){
	    int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static int calculateSquaredSum(int[] arr){
	    int squaredSum = 0;
		for(int i=0; i<arr.length; i++){
			squaredSum += Math.pow(arr[i], 2);
		}
		
		return squaredSum;
	}
	
	// Method to check whether number is a harshad number or not
	public static void checkHarshadNumber(int sum, int num){
		if(num % sum == 0){
			System.out.println("Number is an Harshad number");
		}
		else{
			System.out.println("Number is not an Harshad number");
		}
	}
	
	public static void frequencyOfDigits(int[] arr){
		int[][] frequency = new int[10][2];
		
		for(int i=0; i<10; i++){
			frequency[i][0] = i;
		}
		
		for(int i=0; i<arr.length; i++){
			frequency[arr[i]][1]++;
		}
		
		System.out.println("Digits with there number of occurences in the number");
		for(int i=0; i<10; i++){
			System.out.println(frequency[i][0] + " " + frequency[i][1]);
		}
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		int count = countDigits(number);
		int[] digitsArray = createArray(number, count);
		
		int sum = calculateSum(digitsArray);
		System.out.println("Sum of the digits of the number is " + sum);
		
		int squaredSum = calculateSquaredSum(digitsArray);
		System.out.println("Sum of square of digits of the number is " + squaredSum);
		
		checkHarshadNumber(sum, number);
		frequencyOfDigits(digitsArray);
        		
        // Close the Scanner Object
		input.close();
	}
}