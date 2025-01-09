import java.util.*;

class NumberOfHandshakes{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students");
		int numberOfStudents = input.nextInt();
	    System.out.println("The number of possible handshakes is " + ((numberOfStudents * (numberOfStudents - 1)) / 2));
		
	}
}