import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class ArrayDuplicatesFinder {

    // Method to find duplicates in an array
    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        // Convert the Set of duplicates to a List
        return new ArrayList<>(duplicates);
    }
}