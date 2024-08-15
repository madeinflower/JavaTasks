//Given a natural number:
//a) Determine its two largest digits.
//b) Determine its two smallest digits.
//The number is input from the keyboard, and the answers should be printed.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a natural number: ");
        String number = scanner.nextLine();

        // Initialize variables for maximum and minimum digits
        int max1 = -1, max2 = -1;
        int min1 = 10, min2 = 10;

        // Loop through each digit in the number
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));

            // Update the two largest digits
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }

            // Update the two smallest digits
            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2) {
                min2 = digit;
            }
        }

        // Print the two largest digits
        System.out.println("The two largest digits are: " + max1 + " and " + max2);

        // Print the two smallest digits
        System.out.println("The two smallest digits are: " + min1 + " and " + min2);

        scanner.close();
    }
}
