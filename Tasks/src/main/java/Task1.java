// 3-digit number search
// В трехзначном числе x зачеркнули его вторую цифру.
// Когда к образованному при этом двузначному числу слева приписали вторую цифру числа x, то получилось число 546.
// Найти число x. Написать код  и вывести ответ в консоль
public class Task1 {
    public static void main(String[] args) {
        for (int x = 100; x <= 999; x++) {
            int a = x / 100; // hundreds
            int b = (x / 10) % 10; // tens
            int c = x % 10; // ones

            int z = 100 * b + 10 * a + c;

            if (z == 546) {
                System.out.println("The target number x: " + x);
                break;
            }
        }
    }
}

