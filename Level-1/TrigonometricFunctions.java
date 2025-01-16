// Calculate various trigonometric functions using Math class given an angle in degrees
import java.util.*;
import java.lang.*;

class TrigonometricFunctions{
	
	// Calculate trigonometric functions
	public double[] calculateTrigonometricFunctions(double angle){
		double[] result = new double[3];
		angle = Math.toRadians(angle);
		
		result[0] = Math.sin(angle);
		result[1] = Math.cos(angle);
		result[2] = Math.tan(angle);
		
		return result;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter angle in degree");
		int angle = input.nextInt();
		
		// Declaring and storing sin, cos and tan in array, respectively.
		TrigonometricFunctions obj = new TrigonometricFunctions();
		double[] trigonoFunctions = new double[3];
		trigonoFunctions = obj.calculateTrigonometricFunctions(angle);
		
		System.out.println("Sine of angle is " + trigonoFunctions[0]);
		System.out.println("Cosine of angle is " + trigonoFunctions[1]);
		System.out.println("Tangent of angle is " + trigonoFunctions[2]);
		
        // Close the Scanner Object
		input.close();
	}
}