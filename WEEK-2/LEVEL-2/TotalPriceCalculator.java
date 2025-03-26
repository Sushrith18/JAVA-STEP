/*CODE 5 : Write a program to input the unit price of an item and the quantity to be
bought. Then, calculate the total price.

Hint =&gt; NA
I/P =&gt; unitPrice, quantity
O/P =&gt; The total purchase price is INR ___ if the quantity ___ and unit price is INR ___ */
import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit price of the item: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and the unit price is INR %.2f%n",
                          totalPrice, quantity, unitPrice);

        scanner.close();
    }
}
