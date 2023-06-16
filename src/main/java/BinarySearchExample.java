//4. Write a program that will find your key is found in the given array using binary search method
//        numbers=[1,6,9,3,5,4,7]
//        key=5

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Perform binary search
        int index = binarySearch(numbers, key);

        // Check if the key is found
        if (index != -1) {
            System.out.println("Key " + key + " found at index " + index);
        } else {
            System.out.println("Key " + key + " not found in the array");
        }
    }

    // Binary search method
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Key not found
    }
}