//2. Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10

public class SwapVariables2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Print the initial values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values without a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Print the values after swapping
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
