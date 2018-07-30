import java.text.DecimalFormat;

 /** 
 *Class for Truck objects.
 */
public class Truck extends Vehicle {
   
   //Instance variable
   protected double tonage = 0.0;
   
   /**
   * Tax_Rate Constant.
   */
   public static final double TAX_RATE = 0.02;
   
   /**
   * ALTERNATIVE_FUEL_TAX_RATE Constant.
   */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.01;
   
   /**
   * LARGE_TRUCK_TONS_THRESHOLD Constant.
   */
   public static final double LARGE_TRUCK_TONS_THRESHOLD = 2.0;
   
   /**
      * LARGE_TRUCK_TAX_RATE Constant.
      */
   public static final double LARGE_TRUCK_TAX_RATE = 0.03; 
   
    /** 
    *Constructor calls abstract vehichle constructor. 
    *@param ownerIn sets the owner
    *@param yearMakeModelIn sets the yearMakeModel string
    *@param valueIn set value
    *@param altFuelIn sets alt fuel true or false 
    *@param tonageIn sets the tonage
    */
   public Truck(String ownerIn, String yearMakeModelIn, double valueIn, 
      boolean altFuelIn, double tonageIn) {
      super(ownerIn, yearMakeModelIn, valueIn, altFuelIn);
      tonage = tonageIn;
   }  
   
    /** 
    *Accessor method for tonage instance variable.
    *@return tonage
    */
   public double getTons() {
      return tonage;
   } 
   
   /** 
   *Mutator method for tonage instance variable.
   *@param tonageIn sets tonage
   */
   public void setTons(double tonageIn) {
      tonage = tonageIn;
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
      if (tonage > LARGE_TRUCK_TONS_THRESHOLD) {
         tax += (value * LARGE_TRUCK_TAX_RATE);
      }
      return tax;
   }
   
   /** 
   *Overide the toString from Vehicle. 
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
      String output = owner + ": Truck " + yearMakeModel; 
      if (altFuel) { output += " (Alternative Fuel)"; }
      output += "\n" + "Value: $" + decFormat.format(value) + " Use Tax: $" 
         + decFormat.format(useTax()) + "\nwith Tax Rate: " 
         + decFormat2.format(rate);
      if (tonage > LARGE_TRUCK_TONS_THRESHOLD) {
         output += " Large Truck Tax Rate: " + LARGE_TRUCK_TAX_RATE; }
      return output;  
   } 
}