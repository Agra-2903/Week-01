// Find the youngest friend and tallest friend
import java.util.*;

class AgeHeight{
	public static void main(String[]args){
	
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
		int[] height = new int[3];
		
		System.out.println("Enter the age and height of amar, akbar and anthony");
		for(int i=0; i<3; i++){
			age[i] = input.nextInt();
			height[i] = input.nextInt();
		}
		
		int youngestAge = age[0];
		int tallestHeight = age[0];
		int youngest = 0;
		int tallest = 0;
		
		for(int i=1; i<3; i++){
			if(youngestAge > age[i]){
				youngestAge = age[i];
				youngest = i;
			}
			if(tallestHeight < height[i]){
				tallestHeight = height[i];
				tallest = i;
			}
		}
		
		if(youngest == 0){
			System.out.println("Amar is youngest");
		}
		else if(youngest == 1){
			System.out.println("Akbar is youngest");
		}
		else{
			System.out.println("Anthony is youngest");
		}
		
		if(tallest == 0){
			System.out.println("Amar is tallest");
		}
		else if(tallest == 1){
			System.out.println("Akbar is tallest");
		}
		else{
			System.out.println("Anthony is tallest");
		}
		
        // Close the Scanner Object
		input.close();
	}
}