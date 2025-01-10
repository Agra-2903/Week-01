import java.util.*;

class FirstSmallestNumber{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		String flag;

        if((number1 < number2) && (number1 < number3)){
			flag = "Yes";
		}
		else{
			flag = "No";
		}
		
		System.out.println("Is the first number the smallest? " + flag);
		
	}
}