// Creating multiplication table starting from 6 to 9 of the given number
import java.util.*;

class MultiplicationTable2{
	public static void main(String[]args){
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
        // Declare the 1D Array for storing table
		int[] table = new int[4];
        
		// Input the number
        System.out.println("Enter the number for the multiplication table");
        int number = input.nextInt();
		
		// Creating for loop from 6 to 9
		for(int i=6; i<=9; i++){
			table[i-6] = number * i;
		}
		
		for(int i=6; i<=9; i++){
			System.out.println(number + " * " + i + " = " + table[i-6]);
		}
		
        // Close the Scanner Object
		input.close();
	}
}