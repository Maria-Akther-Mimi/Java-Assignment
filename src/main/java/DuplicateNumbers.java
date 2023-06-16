//14. Find out the duplicate numbers in the given array and in which position they are found.
//     numbers=[1,2,3,1,2,4,5,6,4]
//     Output:
//        Duplicate value: 1 at index 3
//        Duplicate value: 2 at index 4
//        Duplicate value: 4 at index 8

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 4, 5, 6, 4};

        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate value: " + arr[i] + " at index " + j);
                    break;
                }
            }
        }
    }
}