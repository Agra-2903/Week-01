import java.util.*;

class FirstSecondLargest{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		int maxDigit = 10;
		int[] digits = new int[maxDigit];
		
		int index = 0;
		
		while((number != 0) || (index != maxDigit)){
			digits[index] = number % 10;
			index++;
			number /= 10;
		}
		
		int largest = 0;
		int secondLargest = 0;
		for(int i=0; i<index; i++){
			if(largest < digits[i]){
			    secondLargest = largest;
				largest = digits[i];
			}
			else if((secondLargest < digits[i]) && (largest != digits[i])){
				secondLargest = digits[i];
			}
		}
		
		System.out.println("Largest number is " + largest + " and second largest number is " + secondLargest);
		
		input.close();
	}
}