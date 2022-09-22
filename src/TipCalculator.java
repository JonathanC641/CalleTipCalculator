import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculator {
    public static void main(String [] args) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Let's calculate your tip!");
        System.out.print("How many people dined? ");
        int numOfPeople = scan.nextInt();
        System.out.print("What is the tip percentage? ");
        int tip = scan.nextInt();
        System.out.print("Enter the cost of dollars and cents (-1 to end): ");
        double price = scan.nextDouble();
        double totalPrice = 0;
        while (price != -1) {
            totalPrice += price;
            System.out.print("Enter the cost of dollars and cents (-1 to end): ");
            price = scan.nextDouble();
        }
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


        System.out.println("Total bill before tip: " + totalPrice);
        System.out.println("Tip percentage: " + tip);
        System.out.println("Total tip: " + formattedTip);
        System.out.println("Total bill: " + formattedCost);
        System.out.println("Per Person Cost before tip: " + formattedCost2);
        System.out.println("Tip Per Person: " + formattedCost3);
        System.out.println("Total Cost Per Person: " + formattedCost4);

    }
}
