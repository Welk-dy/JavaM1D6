public class ReverseStringManual {

    // Method to reverse a string
    public static String reverseString(String input) {
        // Convert the input string to a character array
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        // Reverse the character array
        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move towards the center
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}