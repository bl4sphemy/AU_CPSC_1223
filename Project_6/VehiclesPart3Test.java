import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * Test program for VehiclesPart3. 
 **/
public class VehiclesPart3Test {

   /** 
    *  Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   
   /** 
   * Test for VehiclesPart3 class. 
   */
   @Test public void testVehiclesPartA3() {
      VehiclesPart3 vPart2Obj = new VehiclesPart3(); // test constructor
      String[] args = {"vehicles1.txt"}; 
      Vehicle.resetVehicleCount();
      VehiclesPart3.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());   
   }
   
   /** 
   * Test for VehiclesPart3_2 class. 
   */
   @Test public void testVehiclesPartB3() {
      VehiclesPart3 vPart2Obj = new VehiclesPart3(); // test constructor
      String[] args = {"vecihles.txt"}; 
      Vehicle.resetVehicleCount();
      VehiclesPart3.main(args);
      Assert.assertEquals(0, Vehicle.getVehicleCount());   
   }
   
   /** 
   * Test for VehiclesPart3_3 class. 
   */
   @Test public void testVehiclesPartC3() {
      VehiclesPart3 vPart2Obj = new VehiclesPart3(); // test constructor
      String[] args = {""}; 
      Vehicle.resetVehicleCount();
      VehiclesPart3.main(args);
      Assert.assertEquals(0, Vehicle.getVehicleCount());
    
         
   }
}