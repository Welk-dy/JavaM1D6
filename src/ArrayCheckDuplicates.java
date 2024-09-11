import java.util.HashSet;

public class ArrayCheckDuplicates {

    // Function to check for duplicates
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store the elements
        HashSet<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // If the element is already in the set, return true (duplicate found)
            if (!seen.add(num)) {
                return true;
            }
        }

        // No duplicates found
        return false;
    }
}