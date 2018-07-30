import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * Test program Template. 
 **/
public class VehiclesPart1Test {

    /** 
    * Fixture initialization (common initialization
    *    for all tests). 
    **/
   @Before public void setUp() {
   }
   
    /** 
    * Test main method in VehiclesPart1. 
    */
   @Test public void vehiclesPart1MainTest() {
      VehiclesPart1 vp1 = new VehiclesPart1(); 
      Vehicle.resetVehicleCount();
      VehiclesPart1.main(null);
      Assert.assertEquals("Vehicle.vehicleCount should be 10. ", 10, 
         Vehicle.getVehicleCount());  
   } 
}