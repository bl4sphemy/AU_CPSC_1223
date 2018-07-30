import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * Test program Template. 
 **/
public class VehiclesPart2Test {

   /** 
    *  Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   
   /** 
   * Test for VehiclesPart2 class. 
   */
   @Test public void testVehiclesPart2() {
      VehiclesPart2 vPart2Obj = new VehiclesPart2(); // test constructor
      String[] args = {"vehicles1.txt"}; 
      Vehicle.resetVehicleCount();
      VehiclesPart2.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());   
   }
}