// Creating multiplication table of the given number
import java.util.*;

class MultiplicationTable{
	public static void main(String[]args){
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
        // Declare the 1D Array for storing table
		int[] table = new int[10];
        
		// Input the number
        System.out.println("Enter the number for the multiplication table");
        int number = input.nextInt();
		
		// Creating for loop
		for(int i=1; i<=10; i++){
			table[i-1] = number * i;
		}
		
		for(int i=1; i<=10; i++){
			System.out.println(number + " * " + i + " = " + table[i-1]);
		}
		
        // Close the Scanner Object
		input.close();
	}
}