import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum variable
        int sum = 0;

        // Loop through all numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                // Add the even number to the sum
                sum += i;
            }
        }

        // Print the result
        System.out.println("Sum of even numbers up to " + number + " is: " + sum);
    }
}
