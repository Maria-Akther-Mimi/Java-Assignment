//12. Write a program that will shuffle (values will randomly change their position) from the given array
//numbers=[1,2,3,4,5,6,7,8,9,0]
//random output: 3 5 0 1 7 9 6 4 2 8

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistShuffle {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        List<Integer> numberList = Arrays.asList(numbers);

        // Shuffle the array
        Collections.shuffle(numberList);

        System.out.println("Random Output: " + numberList);
    }
}
