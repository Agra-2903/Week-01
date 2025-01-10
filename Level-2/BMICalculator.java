import java.util.*;

class BMICalculator{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of persons");
		int count = input.nextInt();
		
		double[] weights = new double[count];
		double[] heights = new double[count];
		double[] bmi = new double[count];
		String[] status = new String[count];
		
		System.out.println("Enter the weight(in Kg) and height(in m) of persons");
		for(int i=0; i<count; i++){
			weights[i] = input.nextDouble();
			heights[i] = input.nextDouble();
			
			bmi[i] = weights[i] / (heights[i] * heights[i]);
			
			if(bmi[i] <= 18.4){
				status[i] = "Underweight";
			}
			else if((bmi[i] >= 18.5) && (bmi[i] <= 24.9)){
				status[i] = "Normal";
			}
			else if((bmi[i] >= 25.0) && (bmi[i] <= 39.9)){
				status[i] = "Overweight";
			}
			else{
				status[i] = "Obese";
			}
			
			System.out.println("Height: " + heights[i] + ", weight: " + weights[i] + ", bmi: " + bmi[i] + ", status: " + status[i]);
		}
		
		input.close();
	}
}