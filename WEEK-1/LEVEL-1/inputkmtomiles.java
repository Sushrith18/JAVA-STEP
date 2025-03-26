/*8) Create a program to convert distance in kilometers to
miles. */
import java.util.Scanner;
public class inputkmtomiles {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double km;
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();
        double miles = km / 1.6; 

        System.out.printf("%.2f kilometers is equal to %.2f miles.%n", km, miles);
        input.close(); 
    }
}
