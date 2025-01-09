import java.util.*;

class TempFahrenheitToCel{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit");
		double fahrenheit = sc.nextDouble();
		double celsiusResult =  (fahrenheit − 32) x (5/9);
		System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
	}
}