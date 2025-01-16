// Unit convertor which converts Fahrenheit to Celsius, Celsius to Fahrenheit, pounds to kilograms, kilograms to pounds, gallons to liters and liters to gallons
import java.util.*;

class UnitConvertor3{
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKg(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKgToPounds(double kg) {
        double kilograms2pounds = 2.20462;
        return kg * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter temperature in fahrenheit");
		double fahrenheit = input.nextDouble();
		System.out.println("Enter temperature in celsius");
		double celsius = input.nextDouble();
		System.out.println("Enter pounds");
		double pounds = input.nextDouble();
		System.out.println("Enter kilograms");
		double kg = input.nextDouble();
		System.out.println("Enter gallons");
		double gallons = input.nextDouble();
		System.out.println("Enter liters");
		double liters = input.nextDouble();
		
		System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        System.out.println(pounds + " pounds is " + convertPoundsToKg(pounds) + " Kg.");
        System.out.println(kg + " kilograms is " + convertKgToPounds(kg) + " pounds.");
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");
        		
        // Close the Scanner Object
		input.close();
	}
}