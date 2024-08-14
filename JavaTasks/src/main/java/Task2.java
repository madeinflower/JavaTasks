// The number is entered from the keyboard, and the result is displayed in the console.
// If the integer `m` is divisible by the integer `n` without a remainder, display the quotient.
// Otherwise, display the message "m is not divisible by n without a reminder."

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter numbers m and n
        System.out.print("Enter number m: ");
        int m = scanner.nextInt();

        System.out.print("Enter number n: ");
        int n = scanner.nextInt();

        // Checking for divisibility without a remainder
        if (n == 0) {
            System.out.println("Division by zero is not possible.");
        } else if (m % n == 0) {
            int result = m / n;
            System.out.println("Quotient: " + result);
        } else {
            System.out.println(m + " by " + n + " is not divisible without a reminder.");
        }
    }
}

