/*CODE 2 : Write a program that takes the base and height to find area of a triangle in square
inches and square centimeters
Hint =&gt; Area of a Triangle is ½ * base * height
I/P =&gt; base, height
O/P =&gt; Your Height in cm is ___ while in feet is ___ and inches is ___*/
import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = scanner.nextDouble();

        double areaInInches = 0.5 * baseInches * heightInches;
        double areaInCm = areaInInches * 6.4516;
        double heightFeet = heightInches / 12;
        double heightCm = heightInches * 2.54; 

        System.out.printf("Your Height in cm is %.2f, in feet is %.2f, and in inches is %.2f%n", 
                          heightCm, heightFeet, heightInches);
        System.out.printf("Area of the triangle is %.2f square inches and %.2f square centimeters.%n", 
                          areaInInches, areaInCm);

        scanner.close();
    }
}
