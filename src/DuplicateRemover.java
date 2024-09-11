import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemover {

    // Function to remove duplicates from an array
    public static int[] removeDuplicates(int[] nums) {
        // Using LinkedHashSet to maintain insertion order and remove duplicates
        Set<Integer> uniqueElements = new LinkedHashSet<>();

        // Add each element of the array to the LinkedHashSet
        for (int num : nums) {
            uniqueElements.add(num);
        }

        // Convert the LinkedHashSet back to an array
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            result[index++] = num;
        }

        return result;
    }
}