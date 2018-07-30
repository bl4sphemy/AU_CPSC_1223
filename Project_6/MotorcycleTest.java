import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * Test program Template. 
 **/
public class MotorcycleTest {

   private Motorcycle bike1;
   private Motorcycle bike2;
   private Motorcycle bike3;
   private Motorcycle bike4; 
   private Motorcycle bike5; 
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
         bike1 = new Motorcycle("Brando, Marlon",
               "1964 Harley-Davidson Sportster", 14000, false, 750);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(280.00, bike1.useTax(), DELTA);  
   } 
   
   /** 
   * Test for the useTaxAltFuelTest method. 
   */
   @Test public void useTaxAltFuelTest() {
      //Assert.assertEquals(460.00, bike5.useTax(), DELTA);
      try {
         bike5 = new Motorcycle("Johnson, Duane",
            	"1975 Honda Scooter", 5000, true, 450);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(bike5.toString().contains("(Alternative Fuel)"));     
   } 
   
   /** 
   * Test for the useTaxLargeBikeTest method. 
   */
   @Test public void useTaxLargeBikeTest() {
      try {
         bike2 = new Motorcycle("Dean, James",
              "1962 Triumph Bonneville", 23000, false,  865);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(bike2.toString().contains("Large Bike Tax Rate"));   
   } 
      
   /** 
   * Test for the override toString method. 
   */
   @Test public void toStringTest() {
      try {
         bike1 = new Motorcycle("Brando, Marlon",
               "1964 Harley-Davidson Sportster", 14000, false, 750);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(bike1.toString().contains("Motorcycle"));   
   } 
   
   /** 
   * Test for int value. 
   */
   @Test public void haseCodeTest() { 
      try {
         bike1 = new Motorcycle("Brando, Marlon",
               "1964 Harley-Davidson Sportster", 14000, false, 750);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(0, bike1.hashCode());   
   }
   
   /** 
   * Test equals true condition in Vehicle. 
   */
   @Test public void equalsTest() {
      try {
         bike1 = new Motorcycle("Brando, Marlon",
               "1964 Harley-Davidson Sportster", 14000, false, 750);
         bike4 = new Motorcycle("Brando, Marlon",
               "1964 Harley-Davidson Sportster", 14000, false, 750);
      } 
      catch (NegativeValueException e) { 
      } 
      Assert.assertTrue(bike1.equals(bike4));  
   }
   
   /** 
   * Test equals false condition in Vehicle. 
   */
   @Test public void notEqualsTest() { 
      try {
         bike1 = new Motorcycle("Brando, Marlon",
               "1964 Harley-Davidson Sportster", 14000, false, 750);
         bike2 = new Motorcycle("Dean, James", 
               "1962 Triumph Bonneville", 23000, false,  865); 
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertFalse(bike1.equals(bike2));  
   }
   
   /** 
   * Test the getOwner method in Vehicle. 
   */
   @Test public void getOwnerTest() {
      try {
         bike1 = new Motorcycle("Brando, Marlon",
               "1964 Harley-Davidson Sportster", 14000, false, 750);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(bike1.getOwner().contains("Brando, Marlon"));   
   }
   
   /** 
   * Test the setOwner method in Vehicle. 
   */
   @Test public void setOwnerTest() {
      try {
         bike3 = new Motorcycle("", "", 0.0, false, 0);
      } 
      catch (NegativeValueException e) { 
      }
      bike3.setOwner("User, Test");
      Assert.assertTrue(bike3.getOwner().contains("User, Test"));   
   } 
   
   /** 
   * Test the getYearMakeModel method in Vehicle. 
   */
   @Test public void getYearMakeModelTest() {
      try {
         bike2 = new Motorcycle("Dean, James",
               "1962 Triumph Bonneville", 23000, false,  865);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(bike2.getYearMakeModel()
         .contains("1962 Triumph Bonneville"));   
   }
   
   /** 
   * Test the setYearMakeModel method in Vehicle. 
   */
   @Test public void setYearMakeModelTest() {
      try {
         bike3 = new Motorcycle("", "", 0.0, false, 0);
      } 
      catch (NegativeValueException e) { 
      }
      bike3.setYearMakeModel("2018 Harley-Davidson Softtail");
      Assert.assertTrue(bike3.getYearMakeModel()
         .contains("2018 Harley-Davidson Softtail"));   
   }
   
   /** 
   * Test for the getValue method in Vehicle. 
   */
   @Test public void getValueTest() {
      try {
         bike2 = new Motorcycle("Dean, James",
               "1962 Triumph Bonneville", 23000, false,  865);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(23000.00, bike2.getValue(), DELTA);  
   }  
   
   /** 
   * Test for the setValue method in Vehicle. 
   */
   @Test public void setValueTest() {
      try {
         bike3 = new Motorcycle("", "", 0.0, false, 0);
      } 
      catch (NegativeValueException e) { 
      }
      bike3.setValue(49000.00);
      Assert.assertEquals(49000.00, bike3.getValue(), DELTA);  
   } 
   
   /** 
   * Test the getAlternativeFuel method in Vehicle. 
   */
   @Test public void getAlternativeFuelTest() {
      try {
         bike1 = new Motorcycle("Brando, Marlon",
               "1964 Harley-Davidson Sportster", 14000, false, 750);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertFalse(bike1.getAlternativeFuel());   
   }
   
   /** 
   * Test the setAlternativeFuel method in Vehicle. 
   */
   @Test public void setAlternativeFuelTest() {
      try {
         bike3 = new Motorcycle("", "", 0.0, false, 0);
      } 
      catch (NegativeValueException e) { 
      }
      bike3.setAlternativeFuel(true);
      Assert.assertTrue(bike3.getAlternativeFuel());   
   }
   
   /** 
   * Test getEngineSize method. 
   */
   @Test public void getEngineSizeTest() { 
      try {
         bike1 = new Motorcycle("Brando, Marlon",
               "1964 Harley-Davidson Sportster", 14000, false, 750);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(750, bike1.getEngineSize());   
   }
   
   /** 
   * Test setEngineSize method. 
   */
   @Test public void setEngineSizeTest() { 
      try {
         bike3 = new Motorcycle("", "", 0.0, false, 0);
      } 
      catch (NegativeValueException e) { 
      }
      bike3.setEngineSize(950);
      Assert.assertEquals(950, bike3.getEngineSize());   
   } 
}
