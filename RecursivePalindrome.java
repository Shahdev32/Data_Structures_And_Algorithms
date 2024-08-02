public class RecursivePalindrome {

    // Method to check if a string is a palindrome using recursion
    public static boolean isPalindrome(String str) {
        // Remove all non-alphanumeric characters and convert to lower case
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Base case: if the string has 0 or 1 character, it is a palindrome
        if (str.length() <= 1) {
            return true;
        }
        
        // Check if the first and last characters are the same
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // Recursive call by removing the first and last characters
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        
        // If the first and last characters are not the same, it is not a palindrome
        return false;
    }

    public static void main(String[] args) {
        String testString = "A man, a plan, a canal, Panama";
        if (isPalindrome(testString)) {
            System.out.println("\"" + testString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + testString + "\" is not a palindrome.");
        }
    }
}


