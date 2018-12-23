package chapter6;

import java.text.DecimalFormat;

/**
 * SportsCar class
 */

public class SportsCar
{
   private CarType make;    // The car's make
   private CarColor color;  // The car's color
   private double price;    // The car's price
   
   /**
    * The constructor accepts arguments for the      
    * car's make, color, and price.
    */
   
   public SportsCar(CarType aMake, CarColor aColor,
                    double aPrice)
   {
      make = aMake;
      color = aColor;
      price = aPrice;
   }

   /**
    * getMake method 
    */
   
   public CarType getMake()
   {
      return make;
   }

   /**
    * getColor method
    */
   
   public CarColor getColor()
   {
      return color;
   }
   
   /**
    * getPrice method
    */
   
   public double getPrice()
   {
      return price;
   }
   
   /**
    *  toString method 
    */
   
   public String toString()
   {
      // Create a DecimalFormat object for
      // dollar formatting.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Create a string representing the object.
      String str = "Make: " + make + 
                   "\nColor: " + color +
                   "\nPrice: $" + dollar.format(price);
      
      // Return the string.
      return str;
   }
}