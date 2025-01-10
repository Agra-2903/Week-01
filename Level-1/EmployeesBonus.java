import java.util.*;

class EmployeesBonus{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary and Year of Service of an Employee");
        int salary = input.nextInt();
		int year = input.nextInt();
		int bonus;
		
        if(year >= 5){
			bonus = (salary * 5) / 100;
			System.out.println("Bonus for the employee is " + bonus);
		}
		else{
			System.out.println("Year of Service is less than 5");
		}
	}
}