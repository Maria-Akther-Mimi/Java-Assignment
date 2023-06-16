//13. Take any number as input and print the reverse of the number
//        input: 12345
//        output: 54321

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reverse = reverseNumber(number);

        System.out.println("Reverse of number: " + reverse);
    }

    public static int reverseNumber(int number) {
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return reverse;
    }
}