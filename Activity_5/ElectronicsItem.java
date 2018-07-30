/** 
*ElectronicsItem subclass.
*/
public class ElectronicsItem extends InventoryItem {
   
   protected double weight = 0.0;
   
   /** 
   *Shipping Cost constant.
   */
   public static final double SHIPPING_COST = 1.5;    
    
    /** 
    Constructor.
    @param nameIn name to set
    @param priceIn price to set
    @param weightIn weight to set
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      
      weight = weightIn;  
   }
   /** 
   *Calculates shipping cost * weight + tax and returns the value.
   *@return calculateCost
   */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}