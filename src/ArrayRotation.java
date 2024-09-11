public class ArrayRotation {

    // Predefined array
    private int[] arr = {1, 2, 3, 4, 5, 6, 7};

    // Function to rotate the array
    public void rotateArray(int positionArray) {
        int n = arr.length;

        // Normalize d in case it's larger than the array size
        positionArray = positionArray % n;

        // Reverse the first d elements
        reverseArray(0, positionArray - 1);

        // Reverse the remaining n-d elements
        reverseArray(positionArray, n - 1);

        // Reverse the entire array
        reverseArray(0, n - 1);
    }

    // Function to reverse an array from start to end
    private void reverseArray(int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print the array
    public void printArray() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Getter for the array (if needed)
    public int[] getArray() {
        return arr;
    }
}