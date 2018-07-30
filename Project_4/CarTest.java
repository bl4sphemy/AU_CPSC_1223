import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * CarTest Unit testing. 
 **/
public class CarTest {

   private Car car1 = new Car("Jones, Sam", "2017 Honda Accord",
       22000, false); 
   private Car car2 = new Car("Jones, Jo", "2017 Honda Accord",
       22000, true); 
   private Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
       110000, false);
   private Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
       110000, true);
   private Car car5 = new Car("blah, blah", "", 0, false);
   private Car car6 = new Car("Jones, Sam", "2017 Honda Accord",
       22000, false);
   private static final double DELTA = 1e-15;

   /** Fixture initialization (common initialization
   *  for all tests). 
   **/
   @Before public void setUp() {
   }
   
   /** 
   * Test for the useTaxStdTest method. 
   */
   @Test public void useTaxStdTest() {
      Assert.assertEquals(220.00, car1.useTax(), DELTA);  
   } 
   
   /** 
   * Test for the !altFule in taxUse method. 
   */
   @Test public void notAltFuelTest() {
      Assert.assertEquals(220.00, car1.useTax(), DELTA);  
   }
   
   /** 
   * Test for the useTaxStdAltTest method. 
   */
   @Test public void useTaxStdAltTest() {
      Assert.assertEquals(110.00, car2.useTax(), DELTA);  
   } 
   
   /** 
   * Test for the useTaxLuxTest method. 
   */
   @Test public void useTaxLuxTest() {
      Assert.assertEquals(3300.00, car3.useTax(), DELTA);  
   } 
   
   /** 
   * Test for the useTaxLuxTest method. 
   */
   @Test public void useTaxLuxAltTest() {
      Assert.assertEquals(2750.00, car4.useTax(), DELTA);  
   }
      
   /** 
   * Test for the override toString method. 
   */
   @Test public void toStringTest() {
      Assert.assertTrue(car1.toString().contains("with Tax Rate:"));   
   } 
   
   /** 
   * Test for int value. 
   */
   @Test public void haseCodeTest() { 
      Assert.assertEquals(0, car1.hashCode());   
   }
   
   /** 
   * Test equals true condition in Vehicle. 
   */
   @Test public void equalsTest() { 
      Assert.assertTrue(car1.equals(car6));  
   }
   
   /** 
   * Test equals false condition in Vehicle. 
   */
   @Test public void notEqualsTest() { 
      Assert.assertFalse(car1.equals(car2));  
   }
   
   /** 
   * Test equals test incompatible object Vehicle. 
   */
   @Test public void notEqualsObjectTest() { 
      Assert.assertFalse(car1.equals(null));  
   }
   
   /** 
   * Test the getOwner method in Vehicle. 
   */
   @Test public void getOwnerTest() {
      Assert.assertTrue(car1.getOwner().contains("Jones, Sam"));   
   }
   
   /** 
   * Test the setOwner method in Vehicle. 
   */
   @Test public void setOwnerTest() {
      car5.setOwner("User, Test");
      Assert.assertTrue(car5.getOwner().contains("User, Test"));   
   } 
   
   /** 
   * Test the getYearMakeModel method in Vehicle. 
   */
   @Test public void getYearMakeModelTest() {
      Assert.assertTrue(car2.getYearMakeModel()
         .contains("2017 Honda Accord"));   
   }
   
   /** 
   * Test the setYearMakeModel method in Vehicle. 
   */
   @Test public void setYearMakeModelTest() {
      car5.setYearMakeModel("2018 Maserati Gilbi");
      Assert.assertTrue(car5.getYearMakeModel()
         .contains("2018 Maserati Gilbi"));   
   }
   
   /** 
   * Test for the getValue method in Vehicle. 
   */
   @Test public void getValueTest() {
      Assert.assertEquals(110000.00, car3.getValue(), DELTA);  
   }  
   
   /** 
   * Test for the setValue method in Vehicle. 
   */
   @Test public void setValueTest() {
      car5.setValue(49000.00);
      Assert.assertEquals(49000.00, car5.getValue(), DELTA);  
   } 
   
   /** 
   * Test the getAlternativeFuel method in Vehicle. 
   */
   @Test public void getAlternativeFuelTest() {
      Assert.assertTrue(car2.getAlternativeFuel());   
   }
   
   /** 
   * Test the setAlternativeFuel method in Vehicle. 
   */
   @Test public void setAlternativeFuelTest() {
      car5.setAlternativeFuel(true);
      Assert.assertTrue(car5.getAlternativeFuel());   
   }
   
   /** 
   * Test for getVehicleCount method in Vehicle. 
   */
   @Test public void getVehicleCountTest() { 
      car1.resetVehicleCount();
      Car testCar1 = new Car("", "", 0, false);
      Car testCar2 = new Car("", "", 0, false);
      Assert.assertEquals(2, car5.getVehicleCount());   
   }
   
   /** 
   * Test for resetVehicleCount method in Vehicle. 
   */
   @Test public void resetVehicleCountTest() { 
      car5.resetVehicleCount();
      Assert.assertEquals(0, car5.getVehicleCount()); 
   }
}