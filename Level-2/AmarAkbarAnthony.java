// Find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights
import java.util.*;

class AmarAkbarAnthony{
	
	// Method to find youngest friend
	void checkYoungest(int[] age){
		if((age[0] <= age[1]) && (age[0] <= age[2])){
			System.out.println("Amar is youngest person");
		}
		else if((age[1] <= age[0]) && (age[1] <= age[2])){
			System.out.println("Akbar is youngest person");
		}
		else{
			System.out.println("Anthony is youngest person");
		}
	}
	
	// Method to find tallest friend
	void checkTallest(int[] height){
		if((height[0] > height[1]) && (height[0] > height[2])){
			System.out.println("Amar is tallest person");
		}
		else if((height[1] > height[0]) && (height[1] > height[2])){
			System.out.println("Akbar is tallest person");
		}
		else{
			System.out.println("Anthony is tallest person");
		}

	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		int[] age = new int[3];
		System.out.println("Enter the age of amar, akbar and anthony, respectively");
		for(int i=0; i<3; i++){
			age[i] = input.nextInt();
		}
		
		int[] height = new int[3];
		System.out.println("Enter the height of amar, akbar and anthony, respectively");
		for(int i=0; i<3; i++){
			height[i] = input.nextInt();
		}
		
		AmarAkbarAnthony obj = new AmarAkbarAnthony();
		
		obj.checkYoungest(age);
		obj.checkTallest(height);
        		
        // Close the Scanner Object
		input.close();
	}
}