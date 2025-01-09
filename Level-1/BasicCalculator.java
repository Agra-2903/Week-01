import java.util.*;

class BasicCalculator{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers");
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		float addResult = number1 + number2;
		float subResult = number1 - number2;
		float mulResult = number1 * number2;
		float divResult = number1 / number2;
		
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addResult + ", " + subResult + ", " + mulResult + ", and " + divResult);
	}
}