import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 /** 
 * Test for the NegativeValueException. 
 **/   
public class NegativeValueExceptionTest {


    /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
      boolean thrown = false;
      try {
         Car car = new Car("Jackson, Bo", "2012 Toyota Camry", -25000, false); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
         Assert.assertTrue("Expected NegativeValueException to be thrown.",
            thrown); /* or alternatively: */
         Assert.assertEquals("Expected NegativeValueException to be thrown.",
             true, thrown);
      }
   }
}
