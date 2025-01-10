import java.util.*;

class NumbersSum{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for sum and enter 0 to stop calculation");
        double number = input.nextDouble();
		double total = 0;
		
        while(number != 0){
			total += number;
			number = input.nextDouble();
		}
		
        System.out.println(total);
	}
}