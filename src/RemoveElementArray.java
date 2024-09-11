import java.util.ArrayList;
import java.util.List;

public class RemoveElementArray {

    // Method to remove all occurrences of an element
    public static int[] removeAllElement(int[] array, int key) {
        // Use a List to store elements that are not equal to the key
        List<Integer> resultList = new ArrayList<>();

        // Iterate through the array and add non-key elements to the list
        for (int num : array) {
            if (num != key) {
                resultList.add(num);
            }
        }

        // Convert the List back to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}