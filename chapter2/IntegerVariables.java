package chapter2;

// This program has variables of several of the integer types.

public class IntegerVariables
{
   public static void main(String[] args)
   {  
      int checking;  // Declare an int variable named checking.
      byte miles;    // Declare a byte variable named miles.
      short minutes; // Declare a short variable named minutes.
      long days;     // Declare a long variable named days.

      checking = -20;
      miles = 105;
      minutes = 120;
      days = 189000;
      System.out.print("We have made a journey of " + miles);
      System.out.println(" miles.");
      System.out.println("It took us " + minutes + " minutes.");
      System.out.println("Our account balance is $" + checking);
      System.out.print("About " + days + " days ago Columbus ");
      System.out.println("stood on this spot.");
   }
}
