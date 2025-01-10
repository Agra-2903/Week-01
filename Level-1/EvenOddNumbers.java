// Print even and odd array
import java.util.*;

class EvenOddNumbers{
	public static void main(String[]args){
	
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Initialization
		int number = input.nextInt();
		
		// Check whether number is natural number or not
        if(number <= 0){
			System.out.println("Error");
		}
		else{
		    int size = (number / 2) + 1;
			
			// Declaring even and odd 1D Array
			int[] evenArr = new int[size];
			int[] oddArr = new int[size];
			
			int evenIndex = 0, oddIndex = 0;
			
			// Storing even and odd number in the corresponding array
			for(int i=1; i<=number; i++){
				if(i % 2 == 0){
					evenArr[evenIndex] = i;
					evenIndex++;
				}
				else{
					oddArr[oddIndex] = i;
					oddIndex++;
				}
			}
			
			// Display Even and Odd number
			System.out.println("Even numbers from 1 to " + number + " are: ");
			for(int i=0; i<evenIndex; i++){
				System.out.println(evenArr[i]);
			}
			System.out.println("Odd numbers from 1 to " + number + " are: ");
			for(int i=0; i<oddIndex; i++){
				System.out.println(oddArr[i]);
			}
		}
		
        // Close the Scanner Object
		input.close();
	}
}