//Given a natural number, determine how many times its first digit appears in the number.
//The number is input from the keyboard, and the answer should be printed.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a natural number: ");
        String number = scanner.nextLine();

        char firstDigit = number.charAt(0); // Get the first digit of the number
        int count = 0;

        // Loop through each digit of the number
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == firstDigit) {
                count++; // Increment the count if the digit matches the first digit
            }
        }

        // Print the count of occurrences of the first digit
        System.out.println("The first digit " + firstDigit + " appears " + count + " times.");

        scanner.close();
    }
}
