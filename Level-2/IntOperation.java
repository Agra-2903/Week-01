import java.util.*;

class IntOperation{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
		System.out.println("Enter Three numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int result1 = a + b * c;
		int result2 = a * b + c;
		int result3 = a % b + c;
		
		System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3);
		
	}
}