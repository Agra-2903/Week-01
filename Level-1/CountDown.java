import java.util.*;

class CountDown{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number count down starts from");
        int counter = input.nextInt();

        while(counter >= 1){
			System.out.println(counter);
			counter--;
		}
		
	}
}