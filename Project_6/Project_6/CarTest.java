import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * CarTest Unit testing. 
 **/
public class CarTest {
 
   private Car car1;  
   private Car car2;  
   private Car car3; 
   private Car car4;
   private Car car5;
   private Car car6;
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
      try {
         car1 = new Car("Jones, Sam", "2017 Honda Accord",
             22000, false);
      } 
      catch (NegativeValueException e) { 
      } 
      Assert.assertEquals(220.00, car1.useTax(), DELTA);  
   } 
   
   /** 
   * Test for the !altFule in taxUse method. 
   */
   @Test public void notAltFuelTest() {
      try {
         car1 = new Car("Jones, Sam", "2017 Honda Accord",
            22000, false);
      } 
      catch (NegativeValueException e) { 
      } 
      Assert.assertEquals(220.00, car1.useTax(), DELTA);  
   }
   
   /** 
   * Test for the useTaxStdAltTest method. 
   */
   @Test public void useTaxStdAltTest() {
      try {
         car2 = new Car("Jones, Jo", "2017 Honda Accord",
            22000, true);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(110.00, car2.useTax(), DELTA);  
   } 
   
   /** 
   * Test for the useTaxLuxTest method. 
   */
   @Test public void useTaxLuxTest() {
      try {
         car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
                110000, false);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(3300.00, car3.useTax(), DELTA);  
   } 
   
   /** 
   * Test for the useTaxLuxTest method. 
   */
   @Test public void useTaxLuxAltTest() {
      try {
         car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
             110000, true);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(2750.00, car4.useTax(), DELTA);  
   }
      
   /** 
   * Test for the override toString method. 
   */
   @Test public void toStringTest() {
      try {
         car1 = new Car("Jones, Sam", "2017 Honda Accord",
            22000, false);
      }
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(car1.toString().contains("with Tax Rate:"));   
   } 
   
   /** 
   * Test for AltFuel in toString method. 
   */
   @Test public void toStringTest2() {
      try {
         car2 = new Car("Jones, Jo", "2017 Honda Accord",
            22000, true);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(car2.toString().contains("(Alternative Fuel)"));   
   } 
   
   /** 
   * Test for Luxury Tax in toString method. 
   */
   @Test public void toStringTest3() {
      try {
         car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
                110000, false);
      } 
      catch (NegativeValueException e) {
      }
      Assert.assertTrue(car3.toString().contains("Luxury Tax Rate: 0.02"));   
   }
   
   /** 
   * Test for int value. 
   */
   @Test public void haseCodeTest() { 
      try {
         car1 = new Car("Jones, Sam", "2017 Honda Accord",
            22000, false);
      } 
      catch (NegativeValueException e) { 
      } 
      Assert.assertEquals(0, car1.hashCode());   
   }
   
   /** 
   * Test equals true condition in Vehicle. 
   */
   @Test public void equalsTest() { 
      try {
         car1 = new Car("Jones, Sam", "2017 Honda Accord",
            22000, false);
         car6 = new Car("Jones, Sam", "2017 Honda Accord",
            22000, false);
      } 
      catch (NegativeValueException e) { 
      } 
      Assert.assertTrue(car1.equals(car6));  
   }
   
   /** 
   * Test equals false condition in Vehicle. 
   */
   @Test public void notEqualsTest() {
      try {
         car1 = new Car("Jones, Sam", "2017 Honda Accord",
            22000, false);
         car2 = new Car("Jones, Jo", "2017 Honda Accord",
            22000, true);
      } 
      catch (NegativeValueException e) { 
      }  
      Assert.assertFalse(car1.equals(car2));  
   }
   
   /** 
   * Test equals test incompatible object Vehicle. 
   */
   @Test public void notEqualsObjectTest() { 
      try {
         car1 = new Car("Jones, Sam", "2017 Honda Accord",
            22000, false);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertFalse(car1.equals(null));  
   }
   
   /** 
   * Test the getOwner method in Vehicle. 
   */
   @Test public void getOwnerTest() {
      try {
         car1 = new Car("Jones, Sam", "2017 Honda Accord",
            22000, false);
      } 
      catch (NegativeValueException e) {
      }
      Assert.assertTrue(car1.getOwner().contains("Jones, Sam"));   
   }
   
   /** 
   * Test the setOwner method in Vehicle. 
   */
   @Test public void setOwnerTest() {
      try {
         car5 = new Car("blah, blah", "", 0, false);
      } 
      catch (NegativeValueException e) { 
      }
      car5.setOwner("User, Test");
      Assert.assertTrue(car5.getOwner().contains("User, Test"));   
   } 
   
   /** 
   * Test the getYearMakeModel method in Vehicle. 
   */
   @Test public void getYearMakeModelTest() {
      try {
         car2 = new Car("Jones, Jo", "2017 Honda Accord",
            22000, true);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(car2.getYearMakeModel()
         .contains("2017 Honda Accord"));   
   }
   
   /** 
   * Test the setYearMakeModel method in Vehicle. 
   */
   @Test public void setYearMakeModelTest() {
      try {
         car5 = new Car("blah, blah", "", 0, false);
      } 
      catch (NegativeValueException e) { 
      }
      car5.setYearMakeModel("2018 Maserati Gilbi");
      Assert.assertTrue(car5.getYearMakeModel()
         .contains("2018 Maserati Gilbi"));   
   }
   
   /** 
   * Test for the getValue method in Vehicle. 
   */
   @Test public void getValueTest() {
      try {
         car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
                110000, false);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(110000.00, car3.getValue(), DELTA);  
   }  
   
   /** 
   * Test for the setValue method in Vehicle. 
   */
   @Test public void setValueTest() {
      try {
         car5 = new Car("blah, blah", "", 0, false);
      } 
      catch (NegativeValueException e) { 
      }
      car5.setValue(49000.00);
      Assert.assertEquals(49000.00, car5.getValue(), DELTA);  
   } 
   
   /** 
   * Test the getAlternativeFuel method in Vehicle. 
   */
   @Test public void getAlternativeFuelTest() {
      try {
         car2 = new Car("Jones, Jo", "2017 Honda Accord",
            22000, true);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(car2.getAlternativeFuel());   
   }
   
   /** 
   * Test the setAlternativeFuel method in Vehicle. 
   */
   @Test public void setAlternativeFuelTest() {
      try {
         car5 = new Car("blah, blah", "", 0, false);
      } 
      catch (NegativeValueException e) { 
      }
      car5.setAlternativeFuel(true);
      Assert.assertTrue(car5.getAlternativeFuel());   
   }
   
   /** 
   * Test for getVehicleCount method in Vehicle. 
   */
   @Test public void getVehicleCountTest() {
      try {
         car5 = new Car("blah, blah", "", 0, false);
         car1 = new Car("Jones, Sam", "2017 Honda Accord",
            22000, false); 
      } 
      catch (NegativeValueException e) { 
      } 
      car1.resetVehicleCount();
      try {
         Car testCar1 = new Car("", "", 0, false);
         Car testCar2 = new Car("", "", 0, false);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(2, car5.getVehicleCount());   
   }
   
   /** 
   * Test for resetVehicleCount method in Vehicle. 
   */
   @Test public void resetVehicleCountTest() { 
      try {
         car5 = new Car("blah, blah", "", 0, false);
      } 
      catch (NegativeValueException e) { 
      }
      car5.resetVehicleCount();
      Assert.assertEquals(0, car5.getVehicleCount()); 
   }
}