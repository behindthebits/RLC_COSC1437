package chapter6;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program demonstrates the Metric class.
 */

public class MetricDemo
{
   public static void main(String[] args)
   {
      double miles,  // A distance in miles
             kilos;  // A distance in kilometers
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a DecimalFormat object for
      // output formatting.
      DecimalFormat fmt = new DecimalFormat("0.00");

      // Get a distance in miles.
      System.out.print("Enter a distance in miles: ");
      miles = keyboard.nextDouble();

      // Convert the distance to kilometers.
      kilos = Metric.milesToKilometers(miles);
      System.out.println(fmt.format(miles)
                  + " miles equals " + fmt.format(kilos)
                  + " kilometers.");

      // Get a distance in kilometers.
      System.out.print("Enter a distance in kilometers: ");
      kilos = keyboard.nextDouble();

      // Convert the distance to kilometers.
      miles = Metric.kilometersToMiles(kilos);
      System.out.println(fmt.format(kilos)
                  + " kilometers equals " + fmt.format(miles)
                  + " miles.");
   }
}
