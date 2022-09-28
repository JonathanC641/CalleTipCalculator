import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculator {
    public static void main(String [] args) {
        // these are th tools that will be used throughout the program //
        DecimalFormat formatter = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);
        // This is the beginning of the program where it welcomes the user and tells them the information needed to //
        // calculate their payment //
        System.out.println("Welcome! Let's calculate your tip!");
        System.out.print("How many people dined? ");
        int numOfPeople = scan.nextInt();
        System.out.print("What is the tip percentage? ");
        int tip = scan.nextInt();
        System.out.print("Enter the cost of dollars and cents (-1 to end): ");
        double price = scan.nextDouble();
        double totalPrice = 0;
        // The while loop is used to repeat the string below so that the user can enter all the items that were bought//
        while (price != -1) {
            totalPrice += price;
            System.out.print("Enter the cost of dollars and cents (-1 to end): ");
            price = scan.nextDouble();
        }
        // The code here modifies the appearance of the final values to represent monetary values //
        String formattedPrice = formatter.format(totalPrice);
        double totalTip = (totalPrice * tip) / 100.0;
        String formattedTip = formatter.format(totalTip);
        double cost = totalPrice + totalTip;
        String formattedCost = formatter.format(cost);
        double payPerPerson = totalPrice / numOfPeople;
        String formattedCost2 = formatter.format(payPerPerson);
        double tipPerPerson = totalTip / numOfPeople;
        String formattedCost3 = formatter.format(tipPerPerson);
        double totalCostPP = payPerPerson + tipPerPerson;
        String formattedCost4 = formatter.format(totalCostPP);

        // This final part of the code are the messages stating the total price and the price each person must pay //
        System.out.println("Total bill before tip: " + formattedPrice);
        System.out.println("Tip percentage: " + tip);
        System.out.println("Total tip: " + formattedTip);
        System.out.println("Total bill: " + formattedCost);
        System.out.println("Per Person Cost before tip: " + formattedCost2);
        System.out.println("Tip Per Person: " + formattedCost3);
        System.out.println("Total Cost Per Person: " + formattedCost4);

    }
}
