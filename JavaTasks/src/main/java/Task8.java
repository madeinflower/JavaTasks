//One unit of a certain product costs 20.4.
//Print a table showing the cost of 2, 3, ..., 20 units of this product.

public class Task8  {
    public static void main(String[] args) {
        double pricePerUnit = 20.4; // Cost of one unit

        // Loop through quantities from 2 to 20
        for (int quantity = 2; quantity <= 20; quantity++) {
            double totalCost = pricePerUnit * quantity; // Calculate the total cost
            // Print the quantity and corresponding total cost
            System.out.println(quantity + " units cost: " + totalCost);
        }
    }
}
