/*CODE 4 : Create a program to swap two numbers
Hint =&gt;
a. Create a variable number1 and take user input.
b. Create a variable number2 and take user input.
c. Swap number1 and number2 and print the swapped output
I/P =&gt; number1, number2
O/P =&gt; The swapped numbers are ___ and ___ */

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (number1): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number (number2): ");
        int number2 = scanner.nextInt();

        // Swapping the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        scanner.close();
    }
}
