import java.util.*;

class PrimeNumber{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
		boolean isPrime = true;
		
        if(number <= 1){
			System.out.println("Invalid input");
		}
		else{
			for (int i = 2; i < number; i++){
				if (number % i == 0){
					isPrime = false;
				}
			}
			
			if(isPrime){
				System.out.println(number + " is a Prime number");
			}
			else{
				System.out.println(number + " is not a Prime number");
			}
		}
	}
}