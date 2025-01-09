import java.util.*;

class HeightConversion{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the height in centimeter");
		double height = input.nextDouble();
		double heightInInch = height / 2.54;
		int heightInFeet = (int)(heightInInch / 12);
		
		System.out.println("Your Height in cm is " + height + " while in feet is " + heightInFeet + " and inches is " + heightInInch);
	}
}