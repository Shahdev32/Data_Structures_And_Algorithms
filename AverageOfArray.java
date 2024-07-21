public class AverageOfArray {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = { 5, 10, 15, 20, 25 };

        // Calculate sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Display the average
        System.out.println("Average of the array elements: " + average);
    }
}
