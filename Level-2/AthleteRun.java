import java.util.*;

class AthleteRun{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
		System.out.println(Enter the three sides of the triangular park);
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		int perimeter = side1 + side2 + side3;
		int round = 0;
		
		if(perimeter % 5 == 0){
			round = perimeter / 5;
		}
		else{
			round = (perimeter / 5) + 1;
		}
		
		System.out.println("The total number of rounds the athlete will run is " + round + " to complete 5 km");
		
	}
}