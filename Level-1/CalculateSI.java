// Calculating simple interest using calculate method/function
import java.util.*;

class CalculateSI{
	public double calculate(double p, double r, double t){
		double result = (p * r * t) / 100;
		return result;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Input principal, rate of interest and time
		System.out.println("Enter the principal amount");
		double principal = input.nextDouble();
		System.out.println("Enter rate of interest");
		double rate = input.nextDouble();
		System.out.println("Enter year");
		int time = input.nextInt();
		
		// Creating object of the class
		CalculateSI obj = new CalculateSI();
		
		// Passing values to the function and storing return value in a variable
		double simpleInterest = obj.calculate(principal, rate, (double)time);
		
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
        		
        // Close the Scanner Object
		input.close();
	}
}