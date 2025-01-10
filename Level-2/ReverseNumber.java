import java.util.*;

class ReverseNumber{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		int originalNumber = number;
		int count = 0;
		
		while(number != 0){
			number /= 10;
			count++;
		}
		
		int[] digits = new int[count];
		
		int i=0;
		while(originalNumber != 0){
			digits[i] = originalNumber % 10;
			originalNumber /= 10;
			i++;
		}
		
		for(i=0; i<count; i++){
			System.out.print(digits[i]);
		}
		
		input.close();
	}
}