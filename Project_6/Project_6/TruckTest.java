import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * Test program Template. 
 **/
public class TruckTest {

   private Truck truck1;
   private Truck truck2;
   private Truck truck3;
   private static final double DELTA = 1e-15;
   
   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   
   /** 
   * Test for the override toString method. 
   */
   @Test public void toStringTest() {
      try {
         truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
            30000, false, 1.5); } 
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(truck1.toString().contains("Chevy Silverado"));   
   }
   
   /** 
   * Test for AltFuel in toString method. 
   */
   @Test public void toStringTest2() {
      try {
         truck2 = new Truck("Williams, Sam", "2010 Chevy Mack", 
               40000, true, 2.5);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(truck2.toString().contains("(Alternative Fuel)"));   
   } 
   
   /** 
   * Test for the getTons method. 
   */
   @Test public void getTonsTest() {
      try {
         truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
               30000, false, 1.5);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(1.5, truck1.getTons(), DELTA);  
   }  
   
   /** 
   * Test for the setTons method. 
   */
   @Test public void setTonsTest() {
      try {
         truck3 = new Truck("", "", 0.0, false, 0.0);
      } 
      catch (NegativeValueException e) { 
      }
      truck3.setTons(1.2);
      Assert.assertEquals(1.2, truck3.getTons(), DELTA);  
   } 
   
   /** 
   * Test for the useTaxStdTruck method. 
   */
   @Test public void useTaxStdTruckTest() {
      try {
         truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
               30000, false, 1.5);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(600.00, truck1.useTax(), DELTA);  
   } 
   
    /** 
    * Test for the useTaxAltTruckTest method. 
    */
   @Test public void useTaxAltTruckTest() {
      try {
         truck2 = new Truck("Williams, Sam", "2010 Chevy Mack", 
              	40000, true, 2.5);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(1600.00, truck2.useTax(), DELTA);  
   } 
   
}