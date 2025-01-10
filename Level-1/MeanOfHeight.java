// Calculate mean of height of the players in a football team.
import java.util.*;

class MeanOfHeight{
	public static void main(String[]args){
	
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
        // Declare the 1D Array
		double[] players = new double[11];
		double sumOfHeight = 0.0;
        
        System.out.println("Enter height of the players");
        for(int i=0; i<11; i++){
			players[i] = input.nextDouble();
			
			// Calculate sum of all elements
			sumOfHeight += players[i];
		}
		
		double mean = sumOfHeight / 11;
		
		System.out.println("Mean height of the football team is " + mean);
		
        // Close the Scanner Object
		input.close();
	}
}