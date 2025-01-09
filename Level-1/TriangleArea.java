import java.util.*;

class TriangleArea{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base in centimeter");
		double base = input.nextDouble();
		System.out.println("Enter the height in centimeter");
		double height = input.nextDouble();
		
		double areaInCm = base * height * 0.5;
		double areaInInch = height / (2.54 * 2.54);
		
		System.out.println("Area of Triangle in cm is " + areaInCm + " and in inches is " + areaInInch);
	}
}