/** 
*Self defined exception for NegativeNumberValue.
*/
public class NegativeValueException extends Exception {
  
  /** 
  * Message Constsant.
  */
   public static final String MESSAGE = "Numeric values must be nonnegative";
   
   /**
   * Constructor, which calls the super-constructor in the Exception class. 
   */
   public NegativeValueException() {
      super(MESSAGE);
      System.out.println();
   }
     
}