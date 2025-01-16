import java.util.*;

class ArrayBoundsException{
	
	// Method to demonstrate ArrayIndexOutOfBoundsException
	public static void demonstrateException(int[] arr){
		try{
			for(int i=0; i<=arr.length; i++){
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds exception handled");
		}
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		int[] arr = new int[10];
		System.out.println("Enter 10 numbers");
		for(int i=0; i<10; i++){
			arr[i] = input.nextInt();
		}
		
		demonstrateException(arr);
        		
        // Close the Scanner Object
		input.close();
	}
}