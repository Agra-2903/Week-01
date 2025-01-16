// Calculate number of rounds athlete will run around triangular park to complete 5km
import java.util.*;

class RoundOfPark{
	
	// Method calculating number of rounds
	int calculateRound(int side1, int side2, int side3){
		int perimeter = side1 + side2 + side3;
		int result = 5000 / perimeter;
		Math.ceil(result);
		return result;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Input sides of the triangular park
		System.out.println("Enter the sides of the triangular park");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		
		RoundOfPark obj = new RoundOfPark();
		
		// Passing values to the function and storing return value in a variable
		int round = obj.calculateRound(side1, side2, side3);
		
		System.out.println("Number of rounds athlete will run around the park to complete 5km is " + round);
        		
        // Close the Scanner Object
		input.close();
	}
}