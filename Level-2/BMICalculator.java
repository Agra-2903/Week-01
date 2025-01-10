import java.util.*;

class BMICalculator{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of the person in kg");
        double weight = input.nextDouble();
		System.out.println("Enter the height of the person in cm");
        double height = input.nextDouble();
		
		double BMI = weight / (height * height);
		BMI *= 10000;
		
        if(BMI <= 18.4){
			System.out.println("BMI of the person is " + BMI + ". \nStatus: Underweight");
		}
		else if((BMI >= 18.5) && (BMI <= 24.9)){
			System.out.println("BMI of the person is " + BMI + ". \nStatus: Normal");
		}
		else if((BMI >= 25.0) && (BMI <= 39.9)){
			System.out.println("BMI of the person is " + BMI + ". \nStatus: Overweight");
		}
		else{
			System.out.println("BMI of the person is " + BMI + ". \nStatus: Overweight");
		}
	}
}