// 3-digit number search

//In the three-digit number x its second digit was crossed out.
// When this digit was added to the left of the resulting two-digit number, the number 546 was obtained.
// Find the number x. Write a code and output the answer to the console.

public class Task1 {
    public static void main(String[] args) {
        for (int x = 100; x <= 999; x++) {
            int a = x / 100; // hundreds
            int b = (x / 10) % 10; // tens
            int c = x % 10; // ones

            int z = 100 * b + 10 * a + c;

            if (z == 546) {
                System.out.println("Target number x: " + x);
                break;
            }
        }
    }
}
