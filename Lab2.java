//Evan Phair			
//12/22/2015					
//Lab 2
//3 product 3 Quanity 2 offeredCost: $3.00
//Quanity: 3.0
//Subtotal: $9.00
//Tax: $0.54
//Total: $9.54
//Offered: $2.00
//Change: $-7.54
//0 Twenties
//0 Tens
//-1 Fives
//-2 Ones
//2 Quarters
//0 Dimes
//0 Nickels
//4 Pennies

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab2
{
  private static Scanner Cash;

public static void main(String[] args)
  {
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    Cash = new Scanner(System.in);
    System.out.print("How much does the product cost?");
    double cost = Cash.nextDouble();
    System.out.print("How many Quanties do you want ?");
    double quanity = Cash.nextDouble();
    double subtotal = (cost * quanity);
    double tax = (subtotal * .06);
    double total = (subtotal + tax);
    System.out.print("How much money has been offered?");
    double Offered = Cash.nextDouble();
            double change = (Offered - total);

        int dollars = (int)change;
        int twenties = dollars / 20;
        int dollars1 = dollars % 20;
        int tens = dollars1 / 10;
        int dollars2 = dollars % 10;
        int fives = dollars2 / 5;
        int dollars3 = dollars % 5;
        int ones = dollars3;

        String moneyString = decimalFormat.format(change);
        Double.toString(change); 
        String[] parts = moneyString.split("\\.");
        String part2 = parts[1]; 
        double cents5 = Double.parseDouble(part2);

        int cents = (int)cents5;
        int quarters = cents / 25;
        int cents1 = cents % 25;
        int dimes = cents1 / 10;
        int cents2 = cents % 10;
        int nickels = cents2 / 5;
        int cents3 = cents % 5;
        int pennies = cents3;

        System.out.println("Cost: " + "$" + decimalFormat.format(cost));
        System.out.println("Quanity: " + quanity);
        System.out.println("Subtotal: " + "$" + decimalFormat.format(subtotal));
        System.out.println("Tax: " + "$" + decimalFormat.format(tax));
        System.out.println("Total: " + "$" + decimalFormat.format(total));
        System.out.println("Offered: " + "$" + decimalFormat.format(Offered));
        System.out.println("Change: " + "$" + moneyString);


        System.out.println(twenties + " Twenties");
        System.out.println(tens + " Tens");
        System.out.println(fives + " Fives");
        System.out.println(ones + " Ones");
        System.out.println(quarters + " Quarters");
        System.out.println(dimes + " Dimes");
        System.out.println(nickels + " Nickels");
        System.out.println(pennies + " Pennies");

  }
}