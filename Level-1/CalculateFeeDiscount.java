import java.util.*;

class CalculateFeeDiscount{
	public static void main(String[]args){
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the fee amount");
		int fee = input.nextInt();
		System.out.println("Enter the discount percentage");
		int discountPercent = input.nextInt();
	    int discount = (fee * discountPercent) / 100;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
	}
}