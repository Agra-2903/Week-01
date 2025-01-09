import java.util.*;

class CalculateSI{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal");
		int principal = sc.nextInt();
		System.out.println("Enter the Rate");
		int rate = sc.nextInt();
		System.out.println("Enter the Time in years");
		int time = sc.nextInt();
		int simpleInterest = (principal * rate * time) / 100;
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	}
}