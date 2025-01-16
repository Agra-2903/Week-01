// Calculate the wind chill temperature given the temperature and wind speed
import java.util.*;

class WindChillTemperature{
	
	// Calculate wind chill temperature
	public double calculateWindChill(double temperature, double windSpeed){
	double result = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);
	return result;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Input temperature and wind speed
		System.out.println("Enter temperature");
		double temperature = input.nextDouble();
		System.out.println("Enter wind speed");
		double windSpeed = input.nextDouble();
		
		// Stores smallest number first and then largest number
		WindChillTemperature obj = new WindChillTemperature();
		double windChillTemperature = obj.calculateWindChill(temperature, windSpeed);
		
		System.out.println("Wind Chill temperature is " + windChillTemperature);
        		
        // Close the Scanner Object
		input.close();
	}
}