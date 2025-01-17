import java.util.*;

class MostFrequentCharacter{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String text = input.nextLine();
		
		int max = 0;
		char frequentChar = text.charAt(0);
		for(int i=0; i<text.length(); i++){
			int count = 1;
			for(int j=i+1; j<text.length(); j++){
				if(text.charAt(i) == text.charAt(j)){
					count++;
				}
			}
			if(count > max){
				max = count;
				frequentChar = text.charAt(i);
			}
		}
		
		System.out.println("Most Frequent Character:" + frequentChar);
	}
}