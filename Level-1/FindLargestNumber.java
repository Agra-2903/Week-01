import java.util.*;

class FindLargestNumber{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		String number1Flag = "No";
		String number2Flag = "No";
		String number3Flag = "No";

        if((number1 > number2) && (number1 > number3)){
			number1Flag = "Yes";
		}
		else if((number2 > number1) && (number2 > number3)){
			number2Flag = "Yes";
		}
		else{
			number3Flag = "Yes";
		}
		
        System.out.println("Is the first number the largest? " + number1Flag);
		System.out.println("Is the second number the largest? " + number2Flag);
		System.out.println("Is the third number the largest? " + number3Flag);
	}
}