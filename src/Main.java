import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter the price of the item
        System.out.print("Enter the price of the item: $");
        double itemPrice = in.nextDouble();

        // Calculate the shipping cost and total price
        double shippingCost;
        double totalPrice;

        if (itemPrice >= 100.0) {
            shippingCost = 0.0;
        } else {
            shippingCost = 0.02 * itemPrice;
        }

        totalPrice = itemPrice + shippingCost;

        // Display the shipping cost and total price
        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total price: $" + totalPrice);

        // Close the in
        in.close();
    }
}