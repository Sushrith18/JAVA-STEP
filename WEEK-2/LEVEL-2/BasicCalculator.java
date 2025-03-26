/*Write a program to create a basic calculator that can perform addition,
subtraction, multiplication, and division. The program should ask for two numbers (floating
point) and perform all the operations
Hint =&gt;
a. Create a variable number1 and number 2 and take user inputs.
b. Perform Arithmetic Operations of addition, subtraction, multiplication and division and
assign the result to a variable and finally print the result
I/P =&gt; number1, number2
O/P =&gt; The addition, subtraction, multiplication and division value of 2 numbers ___ and
___ is ___, ____, ____, and ___ */

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float number1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float number2 = scanner.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;

        System.out.printf("The addition, subtraction, and multiplication of %.2f and %.2f is %.2f, %.2f, and %.2f%n",
                number1, number2, addition, subtraction, multiplication);

        if (number2 != 0) {
            float division = number1 / number2;
            System.out.printf("The division of %.2f by %.2f is %.2f%n", number1, number2, division);
        } else {
            System.out.println("Division by zero is not possible.");
        }

        scanner.close();
    }
}


