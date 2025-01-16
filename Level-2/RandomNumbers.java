import java.util.*;

class RandomNumbers{
	
	// Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000); // Generate a 4-digit number
        }
        return randomNumbers;
    }
	
	// Method to find the average, minimum, and maximum value of an array
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }
		
		double average = (double) sum / numbers.length;
        return new double[] {average, min, max};
    }
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		RandomNumbers obj = new RandomNumbers();
		
		int[] randomNumbers = obj.generate4DigitRandomArray(5);
		
		double[] results = obj.findAverageMinMax(randomNumbers);
		
		System.out.println("4-digit Random Numbers generated are:");
		for(int i=0; i<5; i++){
			System.out.print(randomNumbers[i] + " ");
		}
		System.out.println();
		
		System.out.println("Average of the numbers is " + results[0]);
		System.out.println("Minimum number is " + (int)results[1] + " and maximum number is " + (int)results[2]);
        		
        // Close the Scanner Object
		input.close();
	}
}