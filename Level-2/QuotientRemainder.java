import java.util.*;

class QuotientRemainder{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		System.out.println("The Quotient is " + (number1 / number2) + " and Reminder is " + (number1 % number2) + " of two number " + number1 + " and " + number2);
		
	}
}