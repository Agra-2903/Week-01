import java.util.*;

class PositiveNegative{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        if(number >= 1){
			System.out.println("Positive");
		}
		else if(number == 0){
			System.out.println("Zero");
		}
		else{
			System.out.println("Negative");
		}
		
        
	}
}