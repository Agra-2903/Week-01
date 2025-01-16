import java.util.*;

class NumberChecker5{

    // Method to find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 2]; // Second last factor is the greatest proper factor
    }

    // Method to find the sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of the factors
    public static long findProductOfCubes(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number, int[] factors) {
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number, int[] factors) {
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number, int[] factors) {
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Helper method to find factorial of a number
    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Find factors
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        // Greatest factor
        if (factors.length > 1) {
            System.out.println("Greatest factor: " + findGreatestFactor(factors));
        } else {
            System.out.println("The number is prime, so it has no proper factors.");
        }

        // Sum of factors
        System.out.println("Sum of factors: " + findSumOfFactors(factors));

        // Product of factors
        System.out.println("Product of factors: " + findProductOfFactors(factors));

        // Product of cubes of factors
        System.out.println("Product of cubes of factors: " + findProductOfCubes(factors));

        // Check if the number is perfect
        System.out.println("Is perfect number? " + isPerfectNumber(number, factors));

        // Check if the number is abundant
        System.out.println("Is abundant number? " + isAbundantNumber(number, factors));

        // Check if the number is deficient
        System.out.println("Is deficient number? " + isDeficientNumber(number, factors));

        // Check if the number is strong
        System.out.println("Is strong number? " + isStrongNumber(number));

        input.close();
    }
}
