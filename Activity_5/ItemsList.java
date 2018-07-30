/** 
*Class to create ItemsList obj.
*/
public class ItemsList {

   private InventoryItem [] inventory;
   private int count;
   
   /** 
   *Constructor.
   */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /** 
   *Adds new item to inventory[].
   *@param itemIn set to array index
   */   
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /** 
   *Calculates total of all Inventory Items.
   *@return total
   *@param electronicsSurcharge sets surcharge
   */   
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0.0;   
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }   
      } 
      return total;  
   }
   
   /** 
   *Overrides toString.
   *@return output
   */   
   public String toString() {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n"; 
      }  
      return output;
   }
}