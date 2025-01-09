import java.util.*;

class ConvertKmToMiles{
	public static void main(String[]args){
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter distance in kiolometers");
		double km = input.nextDouble();
		System.out.println("The total miles is " + (km / 1.6) + " mile for the given " + km + " km");
		
	}
}