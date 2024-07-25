public class RecursiveSum {
    // Method to calculate the sum of elements in an array recursively
    public static int recursiveSum(int[] arr, int n) {
        // Base case: if the array is empty, return 0
        if (n <= 0) {
            return 0;
        }
        // Recursive case: sum the last element and the result of recursive sum of the rest of the array
        return arr[n - 1] + recursiveSum(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = recursiveSum(array, array.length);
        System.out.println("The sum of the array elements is: " + sum); // Output: 15
    }
}
