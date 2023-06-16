//17. Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
//        Input: Civic
//        Output: true
//        Input: One
//        Output: false

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "civic";

        boolean isPalindrome = isPalindrome(input);

        System.out.println("Input \"" + input + "\"\nOutput :" +  isPalindrome);
    }

    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();

        return input.equalsIgnoreCase(reversed);
    }
}