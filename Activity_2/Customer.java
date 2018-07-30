/** 
Some javadoc comment here
*/

public class Customer {

   private String name = "";
   private String location;
   private double balance = 0;
   
   /** 
   *Default Constructor.
   *@param nameIn name to set
   */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /** 
   *setLocation method. 
   *@param locationIn sets location
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /** 
   *getLocation method. 
   *@param locationIn sets location
   */
   public void getLocation() {
      return location;
   }
   

  
}