public class FactorialIterative {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5; // Change this to test with different numbers
        System.out.println("Factorial of " + number + " using iteration is: " + factorial(number));
    }
}
