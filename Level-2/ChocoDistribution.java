import java.util.*;

class ChocoDistribution{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of chocolates");
		int numberOfChocolates = input.nextInt();
		System.out.println("Enter number of children");
		int numberOfChildren = input.nextInt();
		int chocolatesRemain = numberOfChocolates % numberOfChildren;
		int chocolateGot = (numberOfChocolates - chocolatesRemain) / numberOfChildren;
		System.out.println("The number of chocolates each child gets is " + chocolateGot + " and the number of remaining chocolates are " + chocolatesRemain);
	}
}