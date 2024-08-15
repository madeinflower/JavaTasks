//Check if the number entered from the keyboard belongs to the interval (–5, 3).
// The number is entered from the keyboard and the result is displayed in the console.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the keyboard
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number belongs to the interval (-5, 3)
        if (number > -5 && number < 3) {
            System.out.println("The number " + number + " belongs to the interval (-5, 3).");
        } else {
            System.out.println("The number " + number + " does not belong to the interval (-5, 3).");
        }
    }
}

