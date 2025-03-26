/*CODE 6 : Write a program to take 2 numbers and print their quotient and reminder
Hint =&gt; Use division operator (/) for quotient and moduli operator (%) for reminder
I/P =&gt; number1, number2
O/P =&gt; The Quotient is ___ and Reminder is ___ of two number ___ and ___ */
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                           " of the two numbers " + number1 + " and " + number2);

        scanner.close();
    }
}
