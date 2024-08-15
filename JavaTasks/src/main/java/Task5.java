//Determine if a triangle with sides 𝑎, b, and c is isosceles.
//It is possible to input the sides of the triangle and get the answer.
//The number is entered from the keyboard, and the result is displayed in the console.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangle from the keyboard
        System.out.print("Enter side a: ");
        int a = scanner.nextInt();

        System.out.print("Enter side b: ");
        int b = scanner.nextInt();

        System.out.print("Enter side c: ");
        int c = scanner.nextInt();

        // Check if the triangle is isosceles
        if (a == b || b == c || a == c) {
            System.out.println("The triangle with sides " + a + ", " + b + ", " + c + " is isosceles.");
        } else {
            System.out.println("The triangle with sides " + a + ", " + b + ", " + c + " is not isosceles.");
        }
    }
}

