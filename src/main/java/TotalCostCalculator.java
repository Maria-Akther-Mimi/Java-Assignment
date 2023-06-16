//20. A core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price]

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalCostCalculator {
    public static void main(String[] args) {
        String paragraph = "A core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        int laptopPrice = extractPrice(paragraph, "laptop");
        int mousePrice = extractPrice(paragraph, "mouse");

        int totalCost = laptopPrice + mousePrice;
        double discountAmount = totalCost * 0.15;
        double discountedCost = totalCost - discountAmount;

        System.out.println("Total Cost: " + totalCost + " tk");
        System.out.println("Discounted Cost (after 15% discount): " + discountedCost + " tk");
    }

    public static int extractPrice(String paragraph, String itemName) {
        int price = 0;

        // Create the regex pattern to match the price
        String pattern = "\\b\\d+\\b";

        // Create a Pattern object
        Pattern pricePattern = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = pricePattern.matcher(paragraph);

        // Find the match for the item name
        while (matcher.find()) {
            String match = matcher.group();

            if (paragraph.contains(itemName) && paragraph.contains(match)) {
                price = Integer.parseInt(match);
                break;
            }
        }

        return price;
    }
}