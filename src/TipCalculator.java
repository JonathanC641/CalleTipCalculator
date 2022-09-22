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
            System.out.print("Enter the cost of dollars and cents (-1 to end): ");
            price = scan.nextDouble();
            totalPrice = price + price;
        }
        System.out.print(totalPrice);
    }
}
