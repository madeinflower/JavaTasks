//A number is entered from the keyboard, and the result is displayed in the console.
//Given a two-digit number, determine:
//a) Which of its digits is larger: the first or the second;
//b) Whether its digits are the same.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a two-digit number
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();

        // Extract the digits
        int firstDigit = number / 10;  // Get the first digit
        int secondDigit = number % 10; // Get the second digit

        // Determine which digit is greater
        if (firstDigit > secondDigit) {
            System.out.println("The first digit (" + firstDigit + ") is greater than the second digit (" + secondDigit + ").");
        } else if (secondDigit > firstDigit) {
            System.out.println("The second digit (" + secondDigit + ") is greater than the first digit (" + firstDigit + ").");
        } else {
            System.out.println("Both digits are equal (" + firstDigit + ").");
        }

        // Check if the digits are the same
        if (firstDigit == secondDigit) {
            System.out.println("The digits are the same.");
        } else {
            System.out.println("The digits are different.");
        }
    }
}

