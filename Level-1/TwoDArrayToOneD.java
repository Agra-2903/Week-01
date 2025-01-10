// Convert 2D array into 1D array
import java.util.*;

class TwoDArrayToOneD{
	public static void main(String[]args){
	
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
        // Declaring the Arrays
		int[][] matrix = new int[rows][columns];
		int[] array = new int[rows * columns];
		
		int index = 0;
		
		// Input the number in the matrix and storing it in 1D array
        for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				matrix[i][j] = input.nextInt();
				
				array[index] = matrix[i][j];
				index++;
			}
		}
		
		for(int i=0; i<index; i++){
			System.out.print(array[i] + " ");
		}
		
        // Close the Scanner Object
		input.close();
	}
}