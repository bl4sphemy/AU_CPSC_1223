import java.text.DecimalFormat;

/** 
*Class for Motorcycle objects. 
*/
public class Motorcycle extends Vehicle {
   
   
   //instance variable
   protected int engine = 0;  
   
   /** 
   *TAX_RATE Constant. 
   */
   public static final double TAX_RATE = 0.005; 
   
   /** 
   *ALTERNATIVE_FUEL_TAX_RATE Constant. 
   */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.0025;
   
   /** 
   *LARGE_BIKE_CC_THRESHOLD Constant. 
   */
   public static final double LARGE_BIKE_CC_THRESHOLD = 499;
   
   /** 
   *LARGE_BIKE_TAX_RATE Constant. 
   */
   public static final double LARGE_BIKE_TAX_RATE = .015;
      
    /** 
    *Constructor calls abstract vehichle constructor. 
    *@param ownerIn sets the owner
    *@param yearMakeModelIn sets the yearMakeModel string
    *@param valueIn set value
    *@param altFuelIn sets alt fuel true or false 
    *@param engineIn sets the engine size
    */
   public Motorcycle(String ownerIn, String yearMakeModelIn, 
      double valueIn, boolean altFuelIn, int engineIn) {
      super(ownerIn, yearMakeModelIn, valueIn, altFuelIn);
      engine = engineIn;
   }
   
    /** 
    *Accessor method for engine instance variable.
    *@return engine
    */
   public int getEngineSize() {
      return engine;
   }
   
    /** 
    *Mutator method for engine instance variable.
    *@param engineIn sets engine size
    */
   public void setEngineSize(int engineIn) {
      engine = engineIn;
   }
   
   /** 
   *Overide the abstract useTax from Vehicle. 
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
      if (engine > LARGE_BIKE_CC_THRESHOLD) {
         tax += (value * LARGE_BIKE_TAX_RATE);
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
      String output = owner + ": Motorcycle " + yearMakeModel; 
      if (altFuel) { output += " (Alternative Fuel)"; }
      output += "\n" + "Value: $" + decFormat.format(value) + " Use Tax: $" 
         + decFormat.format(useTax()) + "\nwith Tax Rate: " 
         + decFormat2.format(rate);
      if (engine >= LARGE_BIKE_CC_THRESHOLD) {  
         output += " Large Bike Tax Rate: " + LARGE_BIKE_TAX_RATE; }
      return output;  
   }
   
   
}