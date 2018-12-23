package chapter9;

public class SubClass3 extends SuperClass3
{
   /**
    *  The following method overrides one of   
    *  the superclass methods.
    */

   public void showValue(int arg)
   {
      System.out.println("SUBCLASS: The int " +
                         "argument was " + arg);
   }

   /**
    *  The following method overloads the base
    *  class methods.
    */

   public void showValue(double arg)
   {
      System.out.println("SUBCLASS: The double " +
                         "argument was " + arg);
   }
}