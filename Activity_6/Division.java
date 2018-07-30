/** 
*Division Class.
*/

public class Division {

   /** 
   * intDivide divides two integers and returns the value. 
   * @return value
   * @param numIn sets numerator
   * @param denomIn sets denominator
   */
   public static int intDivide(int numIn, int denomIn) {
      try {
         int value = numIn / denomIn;
         return value;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }  
   
   /** 
   * decimalDivide divides two integers and returns the float point value. 
   * @return value
   * @param numIn sets numerator
   * @param denomIn sets denominator
   */
   public static double decimalDivide(int numIn, int denomIn) {
      if (denomIn == 0) {
         throw new IllegalArgumentException("The denominator " 
            + "cannot be zero.");
      }
      double value = (double) numIn / denomIn;
      return value;
   }
   
} //end class
