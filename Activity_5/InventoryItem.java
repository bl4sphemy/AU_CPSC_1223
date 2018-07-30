/** 
*Inventory super class.
*/

public class InventoryItem {
   
   protected String name = "";
   protected double price = 0.0;
   private static double taxRate = 0.0;


   /** 
   *Constructor.
   *@param nameIn set name
   *@param priceIn set price
   */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /** 
   *Accessor for name.
   *@return name
   */
   public String getName() {
      return name;
   }
   
   /** 
   *calculates price + tax.
   *@return calculateCost
   */
   public double calculateCost() {
      return (price * (1 + taxRate));
   }
   
   /** 
   *Sets the taxRate.
   *@param taxRateIn rate to set
   */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;    
   }
   
   /** 
   *override toString.
   *@return toString
   */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
}