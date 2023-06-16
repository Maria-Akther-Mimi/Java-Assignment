//3. Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52

import java.text.DecimalFormat;

public class PrintDecimalValue {
    public static void main(String[] args) {
        double n = 15.5276;

        // Create a DecimalFormat object with the desired format
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        // Set the rounding mode to round down
        decimalFormat.setRoundingMode(java.math.RoundingMode.DOWN);

        String formattedValue = decimalFormat.format(n);

        System.out.println("n = " + formattedValue);
    }
}