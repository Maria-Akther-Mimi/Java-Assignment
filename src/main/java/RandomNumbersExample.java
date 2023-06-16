//6. Generate random 10 integer numbers in an array and print out all the numbers from array and also print the max and min number from the array

import java.util.Arrays;
import java.util.Random;

public class RandomNumbersExample {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // Generate random numbers and store them in array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        // Print all the numbers
        System.out.println("Generated Numbers: " + Arrays.toString(numbers));

        // Find maximum and minimum numbers
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        // Print maximum and minimum numbers
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}