import java.util.*;

class DoubleOperation{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
		System.out.println("Enter Three numbers");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double result1 = a + b * c;
		double result2 = a * b + c;
		double result3 = a % b + c;
		
		System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3);
		
	}
}