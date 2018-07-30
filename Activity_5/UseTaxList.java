/** 
Some javadoc comment here
*/

public class UseTaxList {

   private String taxDistrict = "not yet assigned";
   private Vehicle [] vehicleList = new Vehicle[0];
   private String [] excludedRecords = new String[0];
   
   /** 
   *Constructor.
*@param taxDistIn sets tax district
*@param vehicleListIn sets objects in vehicleList
*@param exRecIn sets excludedRecords
*/
   public UseTaxList(String taxDistIn, Vehicle[] vehicleListIn, 
   String[] exRecIn) {
      taxDistrict = taxDistIn;
      vehicleList = vehicleListIn;
      excludedRecords = exRecIn;
   }
   
}
