import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    // Method to sort array based on the direction
    public static Integer[] sortArray(Integer[] arr, String direction) {
        if (direction.equalsIgnoreCase("asc")) {
            // Sort in ascending order
            Arrays.sort(arr);
        } else if (direction.equalsIgnoreCase("desc")) {
            // Sort in descending order using Collections.reverseOrder()
            Arrays.sort(arr, Collections.reverseOrder());
        } else {
            System.out.println("Invalid direction. Use 'asc' or 'desc'.");
        }
        return arr;
    }
}