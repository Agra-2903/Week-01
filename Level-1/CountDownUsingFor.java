import java.util.*;

class CountDownUsingFor{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number count down starts from");
        int counter = input.nextInt();

        for(int i=counter; i>0; i--){
			System.out.println(counter);
		}
		
	}
}