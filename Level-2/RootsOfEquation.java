// Find the roots of the quadratic equation
import java.util.*;

class RootsOfEquation{
	
	// Method to find the roots of the equation
	public static int[] findRoots(int a, int b, int c){
		int delta = (int)Math.pow(b, 2) - (4 * a * c);
		
		int[] arr;
		if(delta > 0){
			arr = new int[2];
			arr[0] = ((-b) + (int)Math.sqrt(delta)) / (2 * a);
			arr[1] = ((-b) - (int)Math.sqrt(delta)) / (2 * a);
		}
		else if(delta == 0){
			arr = new int[1];
			arr[0] = (-b) / (2 * a);
		}
		else{
			arr = new int[0];
		}
		
		return arr;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int[] roots = findRoots(a, b, c);
		
		if(roots.length != 0){
			for(int i=0; i<roots.length; i++){
				System.out.println("Root " + (i+1) + " is " + roots[i]);
			}
		}
		else{
			System.out.println("No Real roots");
		}
        		
        // Close the Scanner Object
		input.close();
	}
}