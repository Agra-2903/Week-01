// Check for Spring season
import java.util.*;

class SpringSeason{
	
	// Checking whether its spring season or not
	boolean seasonCheck(int m, int d){
		if((m == 3) && ((d >= 20) && (d <= 31))){
			return true;
		}
	    else if((m == 4) && ((d >= 1) && (d <= 30))){
			return true;
		}
		else if((m == 5) && ((d >= 1) && (d <= 31))){
			return true;
		}
		else if((m == 6) && ((d >= 1) && (d<= 20))){
			return true;
		}
		else{
			return false;
		}

	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Input month and day
		System.out.println("Enter month and day, respectively");
		int month = input.nextInt();
		int day = input.nextInt();
		
		SpringSeason obj = new SpringSeason();
		
		// Passing values to the function and storing return value in a variable
		boolean isSpringSeason = obj.seasonCheck(month, day);
		
		// Displaying whether its Spring season or not
		if(isSpringSeason){
			System.out.println("It's a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
        		
        // Close the Scanner Object
		input.close();
	}
}