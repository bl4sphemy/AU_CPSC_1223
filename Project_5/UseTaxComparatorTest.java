import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * Test program Template. 
 **/
public class UseTaxComparatorTest {

   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   
     /**
      * Test UseTaxComparator class. 
      */
   @Test public void useTaxComparatorTest() {
      Car carA = new Car("Jones, Sam", "2014 Honda Accord",    
         22000, true);
      Car carB = new Car("Parker, Peter", "2014 Honda Accord",   
         22000, false);
      UseTaxComparator taxListComp = new UseTaxComparator();   
      Assert.assertEquals("Error in UseTaxComparator Class", 
         1, taxListComp.compare(carB, carA));
      Assert.assertEquals("Error in UseTaxComparator Class",   
         -1, taxListComp.compare(carA, carB));
      Assert.assertEquals("Error in UseTaxComparator Class",  
         0, taxListComp.compare(carA, carA));       
   }
}

