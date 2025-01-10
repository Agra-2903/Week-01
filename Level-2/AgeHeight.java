import java.util.*;

class AgeHeight{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age and height of amar");
        int amarAge = input.nextInt();
		int amarHeight = input.nextInt();
		System.out.println("Enter age and height of akbar");
        int akbarAge = input.nextInt();
		int akbarHeight = input.nextInt();
		System.out.println("Enter age and height of anthony");
        int anthonyAge = input.nextInt();
		int anthonyHeight = input.nextInt();
		
		if((amarAge < akbarAge) && (amarAge < anthonyAge)){
			System.out.println("Amar is youngest person");
		}
		else if((akbarAge < amarAge) && (akbarAge < anthonyAge)){
			System.out.println("Akbar is youngest person");
		}
		else{
			System.out.println("Anthony is youngest person");
		}

		
        if((amarHeight > akbarHeight) && (amarHeight > anthonyHeight)){
			System.out.println("Amar is tallest person");
		}
		else if((akbarHeight > amarHeight) && (akbarHeight > anthonyHeight)){
			System.out.println("Akbar is tallest person");
		}
		else{
			System.out.println("Anthony is tallest person");
		}

	}
}