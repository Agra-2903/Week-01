import java.util.*;

class NaturalNumberSumByForLoop{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        if(number > 0){
			int resultByFormula = (number * (number + 1)) / 2;
			int resultByLoop = 0;
			for(int i=number; i>0; i--){
				resultByLoop += i;
			}
			System.out.println("Sum using loop is " + resultByLoop + " and sum using formula " + resultByFormula);
		}
		else{
			System.out.println("The number " + number + " is not a natural number");
		}
	}
}