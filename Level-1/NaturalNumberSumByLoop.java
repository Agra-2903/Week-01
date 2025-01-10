import java.util.*;

class NaturalNumberSumByLoop{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        if(number >= 0){
			int resultByFormula = (number * (number + 1)) / 2;
			int resultByLoop = 0;
			while(number > 0){
				resultByLoop += number;
				number--;
			}
			System.out.println("Sum using loop is " + resultByLoop + " and sum using formula " + resultByFormula);
		}
		else{
			System.out.println("The number " + number + " is not a natural number");
		}
	}
}