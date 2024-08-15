//Among the numbers 1, 4, 9, 16, 25, ... (i.e., squares of natural numbers),
//find the first number greater than n is input from the keyboard, and the answer should be printed.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int i = 1; // Start with the first natural number
        while (true) {
            int square = i * i; // Calculate the square of i
            if (square > n) { // Check if the square is greater than n
                // Print the first square greater than n
                System.out.println("The first square greater than " + n + " is: " + square);
                break; // Exit the loop once we find the result
            }
            i++; // Move to the next natural number
        }

        scanner.close();
    }
}
