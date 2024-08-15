//Write a program that, depending on the ordinal number of the month (1, 2, ..., 12),
//outputs the season of the year to which this month belongs.


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the month number from the keyboard
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        // Determine the season based on the month number
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("The season is Winter.");
                break;
            case 3:
            case 4:
            case 5:
                    System.out.println("The season is Spring.");
                    break;
            case 6:
            case 7:
            case 8:
                        System.out.println("The season is Summer.");
                        break;
            case 9:
            case 10:
            case 11:
                            System.out.println("The season is Autumn.");
                            break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                break;
        }
    }
}
