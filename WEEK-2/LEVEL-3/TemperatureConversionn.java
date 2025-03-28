package WEEK-2.LEVEL-3;
/*import java.util.Scanner;

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
 */
import java.util.Scanner;

public class TemperatureConversionn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("The temperature %.2f°C is equal to %.2f°F.%n", celsius, fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("The temperature %.2f°F is equal to %.2f°C.%n", fahrenheit, celsius);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}


