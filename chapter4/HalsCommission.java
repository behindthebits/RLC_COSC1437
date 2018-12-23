package chapter4;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program calculates a salesperson's gross
 * pay at Hal's Computer Emporium.
 */

public class HalsCommission
{
   public static void main(String[] args)
   {
      double sales,       // To hold amount of sales
             advancePay;  // To hold advance pay
      
      // Create DecimalFormat objects for dollar amounts
      // and percentages.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      DecimalFormat percent = new DecimalFormat("#0%");

      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      System.out.println("This program will display a "
                         + "pay report for a salesperson.");
      System.out.println("Enter the following information:");

      // Ask the user for sales & Advanced Pay
      System.out.print("Amount of sales: $");
      sales = keyboard.nextDouble();
      System.out.print("Amount of advanced pay: $");
      advancePay = keyboard.nextDouble();

      // Create an instance of the SalesCommission
      // class and pass the data to the constructor.
      SalesCommission payInfo =
              new SalesCommission(sales, advancePay);

      // Display the pay report for the salesperson.
      System.out.println("\nPay Report");
      System.out.println("-------------------------");
      System.out.println("Sales: $"
               + dollar.format(payInfo.getSales()));
      System.out.println("Commission rate: "
               + percent.format(payInfo.getRate()));
      System.out.println("Commission: $"
               + dollar.format(payInfo.getCommission()));
      System.out.println("Advanced pay: $"
               + dollar.format(payInfo.getAdvance()));
      System.out.println("Remaining pay: $"
               + dollar.format(payInfo.getPay()));
   }
}

