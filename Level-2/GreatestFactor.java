import java.util.*;

class GreatestFactor{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
		
		int greatestFactor = 1;
		
        for(int i=number - 1; i>0; i--){
			if(number % i == 0){
				greatestFactor = i;
				break;
			}
		}
		
        System.out.println("Greatest Factor of the number is " + greatestFactor);
	}
}