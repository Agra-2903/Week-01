import java.util.*;

class SideOfSquare{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the perimeter of the square");
		int perimeter = input.nextInt();
		int length = perimeter / 4;
		System.out.println("The length of the side is " + length + " whose perimeter is " + perimeter);
		
	}
}