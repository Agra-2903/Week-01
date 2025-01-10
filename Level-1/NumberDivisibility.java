import java.util.*;

class NumberDivisibility{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check the divisibility by 5");
        int number = input.nextInt();
		String flag;
		
		if(number % 5 == 0){
			flag = "Yes";
		}
		else{
			flag = "No";
		}
		
		System.out.println("Is the number " + number + " divisible by 5? " + flag);
		
	}
}