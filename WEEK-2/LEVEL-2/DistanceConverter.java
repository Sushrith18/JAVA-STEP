/*CODE 4 : Write a program the find the distance in yards and miles for the distance provided
by user in feets
Hint =&gt; 1 mile = 1760 yards and 1 yard is 3 feet
I/P =&gt; distanceInFeet
O/P =&gt; Your Height in cm is ___ while in feet is ___ and inches is ___
ANSWER */
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.printf("Distance in yards: %.2f\n", distanceInYards);
        System.out.printf("Distance in miles: %.6f\n", distanceInMiles); 

        scanner.close();
    }
}
