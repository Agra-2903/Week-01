import java.util.*;

class NumbersSumUsingBreak{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for sum and enter 0 to stop calculation");
        double number = input.nextDouble();
		double total = 0;
		
        while(true){
		    if(number <= 0){
				break;
			}
			total += number;
			number = input.nextDouble();
		}
		
        System.out.println(total);
	}
}