package chapter7;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program gathers sales amounts for the week.  
 * It uses the SalesData class to display the total, 
 * average, highest, and lowest sales amounts.
 */

public class Sales
{
   public static void main(String[] args)
   {
      final int ONE_WEEK = 7; // Number of array elements
      
      // Create an array to hold the sales numbers
      // for one week.
      double[] sales = new double[ONE_WEEK];

      // Get the week's sales figures and store them
      // in the sales array.
      getValues(sales);
      
      // Create a SalesData object initialized with the
      // sales array.
      SalesData week = new SalesData(sales);

      // Create a DecimalFormat object for output formatting.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");

      // Display the total, average, highest, and lowest
      // sales amounts for the week.
      System.out.println();
      System.out.println("The total sales were $"
                   + dollar.format(week.getTotal()));
      System.out.println("The average sales were $"
                   + dollar.format(week.getAverage()));
      System.out.println("The highest sales were $"
                   + dollar.format(week.getHighest()));
      System.out.println("The lowest sales were $"
                   + dollar.format(week.getLowest()));
   }

   /**
    * The following method accepts an array as its 
    * argument. The user is asked to enter sales   
    * amounts for each element.
    */

   private static void getValues(double[] array)
   {
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the sales for each of "
                         + "the following days.");

      // Get the sales for each day in the week.
      for (int index = 0; index < array.length; index++)
      {
         System.out.print("Day " + (index + 1) + ": ");
         array[index] = keyboard.nextDouble();
      }
   }
}

