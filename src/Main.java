import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of ArrayRotation
        ArrayRotation arrayRotation = new ArrayRotation();

        // Print the predefined array
        System.out.println("Predefined Array:");
        arrayRotation.printArray();

        // Input the number of positions to rotate
        System.out.print("Enter the number of positions to rotate the array: ");
        int d = scanner.nextInt();

        // Rotate the array
        arrayRotation.rotateArray(d);

        System.out.println("Array after rotation:");
        arrayRotation.printArray();

        ArrayCheckDuplicates duplicateChecker = new ArrayCheckDuplicates();

        // Task 2
        int[] arrayDuplicate = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Predefined Example Array: " + Arrays.toString(arrayDuplicate));
        System.out.println("Array contain duplicate  = " + duplicateChecker.containsDuplicate(arrayDuplicate));

        DuplicateRemover removeDuplicates = new DuplicateRemover();
        System.out.println("Original Array: " + Arrays.toString(arrayDuplicate));

        // Task 3
        // Remove duplicates and get the result
        int[] arrayRemovedDuplicate = DuplicateRemover.removeDuplicates(arrayDuplicate);

        // Print the array after removing duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(arrayRemovedDuplicate));

        // Task 4
        // Predefined array
        Integer[] arraySort = {1, 8, 7, 5, 2, 3};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(arraySort));

        // Prompt the user to enter the sorting direction
        System.out.print("Enter sorting direction (asc or desc): ");
        scanner.nextLine();
        String direction = scanner.nextLine().trim().toLowerCase();

        // Sort the array based on user input
        Integer[] sortedArray = ArraySort.sortArray(arraySort.clone(), direction);

        // Print the sorted array if direction is valid
        if (direction.equals("asc") || direction.equals("desc")) {
            System.out.println("Sorted in " + direction + " order: " + Arrays.toString(sortedArray));
        }

        // Task 5
        // Predefined array
        int[] arrayRemove = {1, 2, 1, 3, 5, 1};

        // Print the original array
        System.out.println("Original Array = " + Arrays.toString(arrayRemove));

        // Prompt the user to enter the element to remove
        System.out.print("Enter the element to remove = ");
        int key = scanner.nextInt();

        // Remove all occurrences of the specified element
        int[] resultArray = RemoveElementArray.removeAllElement(arrayRemove, key);

        // Print the array after removing the specified element
        System.out.println("Array after removing all occurrences of " + key + " = " + Arrays.toString(resultArray));

        // Task 6
        // Prompt the user to enter a string
        scanner.nextLine();
        System.out.print("Enter a string to reverse = ");
        String reverseArray = scanner.nextLine();

        // Reverse the string using StringReverser class
        String reversed = ReverseStringManual.reverseString(reverseArray);

        // Print the reversed string
        System.out.println("Reversed string = " + reversed);

        // Task 7

        // Prompt the user to enter array elements
        System.out.print("Enter array elements separated by spaces to find the duplicates = ");
        String findArrayDuplicates = scanner.nextLine();

        // Convert the input string to an array of integers
        int[] intArrayDuplicate = Arrays.stream(findArrayDuplicates.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Find duplicates using DuplicateFinder class
        List<Integer> duplicates = ArrayDuplicatesFinder.findDuplicates(intArrayDuplicate);

        // Print the duplicates
        System.out.println("Duplicates = " + duplicates);

        // Task 8

        // Prompt the user to enter temperature readings
        System.out.print("Enter temperatures separated by spaces = ");
        String input = scanner.nextLine();

        // Convert the input string to an array of integers
        int[] temperatures = Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Find the number of days until a warmer temperature
        int[] dayTemp = TemperatureFinder.dailyTemperatures(temperatures);

        // Print the result
        System.out.println("Days until warmer temperatures = " + Arrays.toString(dayTemp));

        // Close the scanner
        scanner.close();
    }
}