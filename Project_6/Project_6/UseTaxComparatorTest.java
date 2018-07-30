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
      UseTaxComparator taxListComp = new UseTaxComparator(); 
      try {
         Car car1 = new Car("Jones, Sam", "2014 Honda Accord", 
            22000, true); 
         Car car2 = new Car("Parker, Peter",
            "2014 Honda Accord", 22000, false);   
         Assert.assertEquals("Error in UseTaxComparator Class", 
            1, taxListComp.compare(car2, car1));
         Assert.assertEquals("Error in UseTaxComparator Class",   
            -1, taxListComp.compare(car1, car2));
         Assert.assertEquals("Error in UseTaxComparator Class",  
            0, taxListComp.compare(car1, car1)); 
      }
      catch (NegativeValueException e) { 
      }      
   }
}

