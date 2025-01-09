import java.util.*;

class TotalIncome{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
		System.out.println("Enter Salary and Bonus of employee respectively");
		int salary = input.nextInt();
		int bonus = input.nextInt();
		int income = salary + bonus;
		
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " income);
		
	}
}