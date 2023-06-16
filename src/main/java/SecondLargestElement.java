//11. Find out the second largest element of the given array
//        numbers=[5,3,9,7,4,1,8]

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 7, 4, 1, 8};
        int secondLargest = findSecondLargest(numbers);

        System.out.println("The second largest element is : " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }
}