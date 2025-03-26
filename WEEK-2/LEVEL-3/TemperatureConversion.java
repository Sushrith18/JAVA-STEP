    /*CODE 1 : Write a TemperaturConversion program, given the temperature in Celsius
as input outputs the temperature in Fahrenheit
Hint =&gt;
a. Create a celsius variable and take the temperature as user input
b. Use the Formulae Celsius to Fahrenheit: (°C × 9/5) + 32 = °F and assign to
farenheitResult and print the result
I/P =&gt; celcius
O/P =&gt; The ____ celsius is _____ fahrenheit */
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.printf("The temperature %.2f°C is equal to %.2f°F.%n", celsius, fahrenheitResult);

        scanner.close();
    }
}

