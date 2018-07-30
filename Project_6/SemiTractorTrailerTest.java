import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * Test program for SemiTractorTrailer. 
 **/
public class SemiTractorTrailerTest {
   private SemiTractorTrailer semi1;
   private SemiTractorTrailer semi2;
   private SemiTractorTrailer semi3;
   private static final double DELTA = 1e-15;
   
    /** 
     * Fixture initialization (common initialization
     * for all tests). 
    **/
   @Before public void setUp() {
   }
   
   /** 
   * Test for the override toString method. 
   */
   @Test public void toStringTest() {
      try {
         semi1 = new SemiTractorTrailer("Williams, Pat", 
               "2012 International Big Boy", 45000, false, 5.0, 4);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(semi1.toString().contains("Axle Tax Rate:"));   
   }
   
   /** 
   * Test for the getTons method in Truck. 
   */
   @Test public void getTonsTest() {
      try {
         semi1 = new SemiTractorTrailer("Williams, Pat", 
               "2012 International Big Boy", 45000, false, 5.0, 4);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(5.0, semi1.getTons(), DELTA);  
   }  
   
   /** 
   * Test for the setTons method in Truck. 
   */
   @Test public void setTonsTest() {
      try {
         semi3 = new SemiTractorTrailer("", "",
               0.0, false, 0.0, 0);
      } 
      catch (NegativeValueException e) { 
      }
      semi3.setTons(4.2);
      Assert.assertEquals(4.2, semi3.getTons(), DELTA);  
   } 
   
   /** 
   * Test for the useTaxStdTruck method in Truck. 
   */
   @Test public void useTaxStdTruckTest() {
      try {
         semi1 = new SemiTractorTrailer("Williams, Pat", 
               "2012 International Big Boy", 45000, false, 5.0, 4);
      } 
      catch (NegativeValueException e) { 
      }
      Assert.assertEquals(3150.00, semi1.useTax(), DELTA);  
   } 
   
    /** 
    * Test for the useTaxAltTruckTest method in Truck. 
    */
   @Test public void useTaxAltTruckTest() {
      try {
         semi2 = new SemiTractorTrailer("Pederson, Bill",
              	"2015 Peterbuilt Stallion", 85000, false, 5.0, 4);
      } 
      catch (NegativeValueException e) { 
      } 
      Assert.assertEquals(5950.00, semi2.useTax(), DELTA);  
   } 
   
   /** 
   * Test for getAxles method in SemiTractorTrailer. 
   */
   @Test public void getAxlesTest() {
      try {
         semi1 = new SemiTractorTrailer("Williams, Pat", 
               "2012 International Big Boy", 45000, false, 5.0, 4);
      } 
      catch (NegativeValueException e) { 
      } 
      Assert.assertEquals(4, semi1.getAxles());   
   }
   
   /** 
   * Test for setAxles method in SemiTractorTrailer. 
   */
   @Test public void setAxlesTest() { 
      try {
         semi3 = new SemiTractorTrailer("", "",
              	0.0, false, 0.0, 0);
      } 
      catch (NegativeValueException e) { 
      }
      semi3.setAxles(5);
      Assert.assertEquals(5, semi3.getAxles());   
   }
}