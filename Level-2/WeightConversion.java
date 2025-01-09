import java.util.*;

class WeightConversion{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds");
		double weight = input.nextDouble();
		double weightInKg = weight * 2.2;
		
		System.out.println("The weight of the person in pound is " + weight + " and in kg is " + weightInKg);
		
	}
}