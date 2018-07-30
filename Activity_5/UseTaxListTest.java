import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * Test program Template. 
 **/
public class UseTaxListTest {

   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   
   /** 
   * Test for int value. 
   */
   @Test public void genericIntTest() {
      Object obj = new Object(); 
      Assert.assertEquals(0, example1.hashCode());   
   }
      
   /** 
   * Test for the toString method. 
   */
   @Test public void toStringTest() {
      Object obj = new Object();
      String toString = obj.toString();
      Assert.assertTrue(toString.contains("some string"));   
   } 
   
}


