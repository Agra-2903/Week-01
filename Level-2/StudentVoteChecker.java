// Check whether the student can vote depending on his/her age is greater or equal to 18
import java.util.*;

public class StudentVoteChecker{
	
	// Method to check whether student can vote or not
	boolean canStudentVote(int age){
		if(age < 0){
			return false;
		}
		else if(age >= 18){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		StudentVoteChecker obj = new StudentVoteChecker();
		int[] students = new int[10];
		
		for(int i=0; i<10; i++){
		    System.out.println("Enter the age of the student");
			students[i] = input.nextInt();
			boolean isVote = obj.canStudentVote(students[i]);
			
			if(isVote){
				System.out.println("Student can vote");
			}
			else{
				System.out.println("Student cannot vote");
			}
		}
        		
        // Close the Scanner Object
		input.close();
	}
}