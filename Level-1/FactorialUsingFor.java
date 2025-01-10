import java.util.*;

class FactorialUsingFor{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
		int factorial = 1;
		
        if(number == 0 || number == 1){
			System.out.println("Factorial of " + number + " is " + factorial);
		}
		else if(number > 1){
		    for(int i=number; i>1; i--){
				factorial *= i;
			}
			System.out.println("Factorial of " + number + " is " + factorial);
		}
		else{
			System.out.println("Factorial is not possible for this number");
		}
		
	}
}