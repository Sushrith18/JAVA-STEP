/*9) Write a new program similar to the program # 6 but take
user input for Student Fee and University Discount */
import java.util.Scanner;
public class inputuniversityfee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double studentFee;
        double discountPercentage;

        System.out.print("Enter the student fee (in INR): ");
        studentFee = input.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        discountPercentage = input.nextDouble();

        double discountAmount = (discountPercentage / 100) * studentFee;
        double finalPrice = studentFee - discountAmount;

        System.out.printf("Original Student Fee: INR %.2f%n", studentFee);
        System.out.printf("Discount Amount: INR %.2f%n", discountAmount);
        System.out.printf("Final Price after Discount: INR %.2f%n", finalPrice);

        input.close();
    }
}
