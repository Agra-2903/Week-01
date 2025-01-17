import java.util.*;

class RemoveSpecificChar{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String text = input.nextLine();
		System.out.println("Character to Remove: ");
		char specificChar = input.next().charAt(0);
		
		String str = "";
		
		for(char c : text.toCharArray()){
			if(c != specificChar){
				str += c;
			}
		}
		
		System.out.println("Modified String: " + str);
	}
}