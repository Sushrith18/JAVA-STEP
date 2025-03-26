/*6) The University is charging the student a fee of INR
125000 for the course. The University is willing to offer a
discount of 10%. Write a program to find the discounted
amount and discounted price the student will pay for
the course. */
public class universityfee {
    public static void main(String args[]) {
        double courseFee = 125000;
        double discountPercentage = 10;

        double discountAmount = (discountPercentage / 100) * courseFee;
        double discountedPrice = courseFee - discountAmount;

        System.out.printf("Original Course Fee: INR %.2f%n", courseFee);
        System.out.printf("Discount Amount: INR %.2f%n", discountAmount);
        System.out.printf("Discounted Price: INR %.2f%n", discountedPrice);
    }
}
