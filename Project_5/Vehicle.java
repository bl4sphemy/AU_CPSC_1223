//import java.util.Comparator;

/** 
*Abstract Class for Vehicle subclasses.
*/
public abstract class Vehicle implements Comparable<Vehicle> {

   protected String owner, yearMakeModel;
   protected double value;
   protected boolean altFuel;
   protected static int vehicleCount = 0;
   
   /** 
   *Constructor.
   *@param ownerIn sets the owner
   *@param ymmIn sets the yearMakeModel string
   *@param valueIn set value
   *@param altFuelIn sets alt fuel true or false
   */
   public Vehicle(String ownerIn, String ymmIn,
       double valueIn, boolean altFuelIn) {
      owner = ownerIn; 
      yearMakeModel = ymmIn; 
      value = valueIn;
      altFuel = altFuelIn;
      vehicleCount += 1;
   }
   
   /** 
   *Accessor method for owner.
   *@return owner
   */
   public String getOwner() {
      return owner;
   }
   
   /** 
   *Mutator method for owner.
   *@param ownerIn sets the owner
   */
   public void setOwner(String ownerIn) {
      owner = ownerIn;
   }
   
   /** 
   *Accessor method for yearMakeModel.
   *@return yearMakeModel
   */
   public String getYearMakeModel() {
      return yearMakeModel;
   }
   
   /** 
   *Mutator method for yearMakeModel.
   *@param ymmIn sets the yearMakeModel
   */
   public void setYearMakeModel(String ymmIn) {
      yearMakeModel = ymmIn;  
   }
   
   /** 
   *Accessor method for value.
   *@return value
   */
   public double getValue() {
      return value;
   }
   
   /** 
   *Mutator method for value.
   *@param valueIn sets the value
   */
   public void setValue(double valueIn) {
      value = valueIn;
   }
   
   /** 
   *Accessor method for altFuel.
   *@return altFuel
   */
   public boolean getAlternativeFuel() {
      return altFuel;
   }
   
   /** 
   *Mutator method for altFuel.
   *@param altFuelIn sets altFuel
   */
   public void setAlternativeFuel(boolean altFuelIn) {
      altFuel = altFuelIn;
   }
   
   /** 
   *Accessor method for vehicleCount.
   *@return vehicleCount
   */
   public static int getVehicleCount() {
      return vehicleCount; 
   }
   
   /** 
   *reset method for vehicleCount class variable.
   */   
   public static void resetVehicleCount() {
      vehicleCount = 0;
   }
   
    /** 
    *abstract method to return double representing use tax.
    *@return double
    */
   public abstract double useTax();  
    
    /** 
    *toString.
    *@return String
    */
   public String toString() {
      return null;
   }
    
    /**
    *Overides equals method from Object class.
    * @param obj the other object * @return boolean
    * @return boolean 
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Vehicle)) { 
         return false;
      }
      else {
         Vehicle other = (Vehicle) obj;
         return (owner + yearMakeModel + value).
            equals(other.owner + other.yearMakeModel + other.value);
      } 
   }      
    
    /** 
    *override hashCode method from Object class.
    *@return String
    */
   public int hashCode() {
      return 0;
   }
   
    /**
    *campareTo implementation for the Comparable interface. 
    *@param objIn Sherocylinder object
    *@return int
    */
   public int compareTo(Vehicle objIn) {
      int result;
      result = this.getOwner().compareTo(objIn.getOwner());
      return result;
   }
}