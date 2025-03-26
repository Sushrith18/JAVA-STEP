/*4) Create a program to calculate the profit and loss in
number and percentage based on the cost price of INR
129 and the selling price of INR 191. */
public class profitandloss {
    public static void main(String args[]) {
        int cost_price = 129;
        int selling_price = 191;
        int profit = selling_price - cost_price;
        double profit_percentage = ((double) profit / cost_price) * 100;

        System.out.println("Cost Price: INR " + cost_price + "\n" +
                "Selling Price: INR " + selling_price + "\n" +
                "Profit/Loss: INR " + profit + "\n" +
                "Profit Percentage: " + String.format("%.2f", profit_percentage) + " %");
    }
}
