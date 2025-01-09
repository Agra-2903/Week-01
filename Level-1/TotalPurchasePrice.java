import java.util.*;

class TotalPurchasePrice{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
		System.out.println("Enter unit price of the product");
		int unitPrice = input.nextInt();
		System.out.println("Enter quantity of the product to be bought");
		int quantity = input.nextInt();
		int totalPrice = unitPrice * quantity;
		
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
		
	}
}