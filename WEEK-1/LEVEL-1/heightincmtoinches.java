/*10) Write a program that takes your height in centimeters
and converts it into feet and inches */

import java.util.Scanner;
public class heightincmtoinches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");

        double heightCm = input.nextDouble();
        double cmToInches = 1 / 2.54; 
        double inchesToFeet = 12;     
        
        double heightInches = heightCm * cmToInches;
        int feet = (int) (heightInches / inchesToFeet);
        double remainingInches = heightInches % inchesToFeet;

        System.out.printf("Your height in cm is %.2f cm, which is %d feet and %.2f inches.%n",
                          heightCm, feet, remainingInches);

        input.close();
    }
}
