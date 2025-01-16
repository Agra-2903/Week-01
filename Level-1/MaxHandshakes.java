// Calculating maximum number of handshakes possible between given number of students
import java.util.*;

class MaxHandshakes{
	
	int calculateHandshakes(int num){
		int result = (num * (num - 1)) / 2;
		return result;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Input number of students
		System.out.println("Enter number of students");
		int students = input.nextInt();
		
		MaxHandshakes obj = new MaxHandshakes();
		
		// Passing value to the function and storing return value in a variable
		int totalHandshakes = obj.calculateHandshakes(students);
		
		System.out.println("Number of handshakes possible are " + totalHandshakes);
        		
        // Close the Scanner Object
		input.close();
	}
}