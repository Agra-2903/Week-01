// Program to find the bonus of 10 employees, along with the old and new salary
import java.util.*;

class EmployeeBonus{
	public static void main(String[]args){
	
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
		int[] salary = new int[10];
		int[] yearOfService = new int[10];
		
		System.out.println("Enter salary and year of service of the employee");
		for(int i=0; i<10; i++){
			salary[i] = input.nextInt();
			yearOfService[i] = input.nextInt();
			
			if((salary[i] < 100000) || (yearOfService[i] < 1)){
				System.out.println("Invalid salary or year of service.\nEnter again");
				i--;
			}
		}
		
		int[] bonus = new int[10];
		int[] newSalary = new int[10];
		int totalBonus = 0;
		int totalOldSalary = 0;
		int totalNewSalary = 0;
		
		for(int i=0; i<10; i++){
			if(yearOfService[i] >= 5){
				bonus[i] = (salary[i] * 5) / 100;
			}
			else{
				bonus[i] = (salary[i] * 2) / 100;
			}
			
			newSalary[i] = salary[i] + bonus[i];
			
			totalBonus += bonus[i];
			totalOldSalary += salary[i];
			totalNewSalary += newSalary[i];
		}
		
		System.out.println("Total bonus is " + totalBonus + ". So the total new salary is " + totalNewSalary);
		System.out.println("Total old salary was " + totalOldSalary);
		
        // Close the Scanner Object
		input.close();
	}
}