// Finding factors of the number
import java.util.*;

class FactorsOfNumber{
	public static void main(String[]args){
	
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter the number");
		int number = input.nextInt();
		
		int maxFactor = 10;
		int index = 0;
		int[] factorArr = new int[maxFactor];
        
		// Storing factors in the array
        for(int i=1; i<number; i++){
			if(number % i == 0){
				// Add the factors to the array
                if (index == maxFactor) {
                    // Double the array size if needed
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factorArr, 0, temp, 0, index);
                    factorArr = temp;
                }

                factorArr[index] = i;
                index++;
			}
		}
		
		// Display the factors
        System.out.println("The factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.println(factorArr[i]);
        }
		
        // Close the Scanner Object
		input.close();
	}
}