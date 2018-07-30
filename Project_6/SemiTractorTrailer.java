
 /** 
 *Class for SemiTractorTrailer objects.
 */
public class SemiTractorTrailer extends Truck {
   
   //Instance variable
   protected int axles = 0;
   
    /** 
    *Constants. 
    */
   public static final double PER_AXLE_TAX_RATE = 0.005;

    /** 
    *Constructor calls abstract vehichle constructor.
    *@param ownerIn sets the owner
    *@param yearMakeModelIn sets the yearMakeModel string
    *@param valueIn set value
    *@param altFuelIn sets alt fuel true or false 
    *@param tonageIn sets the tonage
    *@param axlesIn sets the axles
    *@throws NegativeValueException if axelsIn is negative
    */
   public SemiTractorTrailer(String ownerIn, String yearMakeModelIn, 
      double valueIn, boolean altFuelIn, double tonageIn, int axlesIn) 
         throws NegativeValueException {
      super(ownerIn, yearMakeModelIn, valueIn, altFuelIn, tonageIn);
      if (axlesIn >= 0) {
         axles = axlesIn;
      } 
      else {
         try { 
            throw new NegativeValueException();
         }
         catch (NegativeValueException e) {
            e.printStackTrace();   
         }
      }
   }
   
    /** 
    *Accessor method for axles instance variable.
    *@return axles
    */
   public int getAxles() {
      return axles;
   }
   
    /** 
    *Mutator method for axles instance variable.
    *@param axlesIn sets number of axles
    */
   public void setAxles(int axlesIn) {
      axles = axlesIn;
   }
   
   /** 
   *Override the useTax from Trucks. 
   *@return tax 
   */
   public double useTax() {
      double tax = 0.0;
      tax = super.useTax();
      tax += (value * PER_AXLE_TAX_RATE * axles);
      return tax;
   }
   
   /** 
   *Override the toString from Trucks. 
   *@return String
   */
   public String toString() {
      String output = "";
      output = super.toString();
      output += " Axle Tax Rate: " + (PER_AXLE_TAX_RATE * axles);
      return output;    
   }   
}