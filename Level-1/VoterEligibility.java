// Check the eligibility of the students for voting
import java.util.*;

class VoterEligibility{
	public static void main(String[]args){
	    // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Declare the 1D array
		int[] students = new int[10];
		
		// Input the age of the students
        System.out.println("Enter the age of 10 students");
        for(int i=0; i<10; i++){
			students[i] = input.nextInt();
			
			// Checking eligibility of the students for voting
			if(students[i] <= 0){
				System.out.println("Invalid age");
			}
			else if(students[i] < 18){
				System.out.println("The student with the age " + students[i] + " cannot vote");
			}
			else{
				System.out.println("The student with the age " + students[i] + " can vote");
			}
		}
		
		input.close();
		
	}
}