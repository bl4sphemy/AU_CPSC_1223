
/** 
*OnlineTextItem abstract class.
*/
public abstract class OnlineTextItem extends InventoryItem {

   /** 
   *Constructor.
   *@param nameIn name to set
   *@param priceIn price to set
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /** 
   *Accessor method for price.
   *@return price
   */
   public double calculateCost() {
      return price; 
   }

}