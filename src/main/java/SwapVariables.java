//1. Suppose, a=10 and b=20. Now swap the value using a temp variable. Output: a=20, b=10

public class SwapVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Print the initial values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Print the values after swapping
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}