//8. Print the prime numbers of 2 to 100

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 2 to 100:");

        // Iterate through the numbers from 2 to 100
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            // Check if the number is divisible by any number from 2 to number-1
            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is not divisible by any number, it is prime
            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
