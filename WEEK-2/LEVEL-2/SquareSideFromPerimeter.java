/*CODE 3 : Write a program to find the side of the square whose parameter you read from
user
Hint =&gt; Perimeter of Square is 4 times side
I/P =&gt; perimeter
O/P =&gt; The length of the side is ___ whose perimeter is ____ */
import java.util.Scanner;

public class SquareSideFromPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        scanner.close();
    }
}
