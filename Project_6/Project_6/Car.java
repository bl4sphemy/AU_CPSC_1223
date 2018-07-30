import java.text.DecimalFormat;

/** 
*Class for Car objects.
*/
public class Car extends Vehicle {

   /**
   * Tax_Rate Constant.
   */
   public static final double TAX_RATE = 0.01;
   
   /**
   * ALTERNATIVE_FUEL_TAX_RATE Constant.
   */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.005;
   
   /**
   * LUXURY_THRESHOLD Constant.
   */
   public static final double LUXURY_THRESHOLD = 50000;
   
   /**
   * LUXURY_TAX_RATE Constant.
   */
   public static final double LUXURY_TAX_RATE = 0.02;
   
   /** 
   *Constructor calls abstract vehichle constructor. 
   *@param ownerIn sets the owner
   *@param yearMakeModelIn sets the yearMakeModel string
   *@param valueIn set value
   *@param altFuelIn sets alt fuel true or false 
   *@throws NegativeValueException 
   */
   public Car(String ownerIn, String yearMakeModelIn, double valueIn, 
      boolean altFuelIn) throws NegativeValueException {
      super(ownerIn, yearMakeModelIn, valueIn, altFuelIn);
   }
   
   /** 
   *Overide the abstract useTax from abstract Vehicle class. 
   *@return tax 
   */
   public double useTax() {
      double tax = 0.0;
      if (altFuel) {
         tax = (value * ALTERNATIVE_FUEL_TAX_RATE);
      }
      else {
         tax = (value * TAX_RATE);        
      }
      if (value >= LUXURY_THRESHOLD) {
         tax += (value * LUXURY_TAX_RATE);
      }
      return tax;
   }
   
   /** 
   *Overide the toString. 
   *@return output
   */
   public String toString() {
      DecimalFormat decFormat = new DecimalFormat("#,##0.00#");
      DecimalFormat decFormat2 = new DecimalFormat("#,##0.0##");
      double rate = 0.0;
      boolean lux = false;
      if (altFuel) {
         rate = ALTERNATIVE_FUEL_TAX_RATE;
      }
      else {
         rate = TAX_RATE;
      }
      String output = owner + ": Car " + yearMakeModel; 
      if (altFuel) { output += " (Alternative Fuel)"; }
      output += "\n" + "Value: $" + decFormat.format(value) + " Use Tax: $" 
         + decFormat.format(useTax()) + "\nwith Tax Rate: " 
         + decFormat2.format(rate);
      if (value >= 50000) { output += " Luxury Tax Rate: 0.02"; }
      return output;  
   }
}