// Check whether the year is leap year or not
import java.util.*;

class LeapYear{
	
	// Method to check year is a leap year or not
	boolean checkYear(int year){
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return true;
			}
		}
		else{
			return false;
		}

	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year = input.nextInt();
		
		LeapYear obj = new LeapYear();
		boolean isLeapYear = obj.checkYear(year);
		
		if(isLeapYear){
			System.out.println("Leap year");
		}
		else{
			System.out.println("Not a leap year");
		}
        		
        // Close the Scanner Object
		input.close();
	}
}