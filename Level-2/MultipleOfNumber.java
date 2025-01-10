import java.util.*;

class MultipleOfNumber{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
		
		System.out.println("Multiples of " + number + " are ");
        for(int i=100; i>0; i--){
			if(number % i == 0){
				System.out.println(i);
			}
		}
	}
}