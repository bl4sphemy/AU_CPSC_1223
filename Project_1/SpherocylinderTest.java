
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * Test program for the SpherocylinderTest Class. 
 **/
public class SpherocylinderTest {

   private static final double DELTA = .001;

   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   
    /** 
    * Test for the getLabel method in Spherocylinder. 
    */
   @Test public void getLabelTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25); 
      Assert.assertEquals("Small Example", example1.getLabel());
      
   }
   
    /** 
    * Test for the setLabel method in Spherocylinder. 
    */
   @Test public void setLabelTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25); 
      example1.setLabel("Test");
      // expected, actual
      Assert.assertEquals("Test", example1.getLabel()); 
      Assert.assertEquals(false, example1.setLabel(null));
        
   }
   
    /** 
    * Test for the getRadius method in Spherocylinder. 
    */
   @Test public void getRadiusTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25); 
      // expected, actual
      Assert.assertEquals(0.5, example1.getRadius(), DELTA);     
   }
   
    /** 
    * Test for the setRadius method in Spherocylinder. 
    */
   @Test public void setRadiusTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25); 
      example1.setRadius(0.2);
      // expected, actual
      Assert.assertEquals(0.2, example1.getRadius(), DELTA); 
      Assert.assertEquals(false, example1.setRadius(-0.1));  
   }
   
    /** 
    * Test for the getCylinderHeight method in Spherocylinder. 
    */
   @Test public void getCylinderHeightTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25); 
      example1.getCylinderHeight();
      // expected, actual
      Assert.assertEquals(0.25, example1.getCylinderHeight(), DELTA);   
   }
   
   /** 
   * Test for the setCylinderHeight method in Spherocylinder. 
   */
   @Test public void setCylinderHeightTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25); 
      example1.setCylinderHeight(0.1);
      // expected, actual
      Assert.assertEquals(0.1, example1.getCylinderHeight(), DELTA); 
      Assert.assertEquals(false, example1.setCylinderHeight(-0.1));  
   }
   
   /** 
   * Test for the circumference method in Spherocylinder. 
   */
   @Test public void circumferenceTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25); 
      // expected, actual
      Assert.assertEquals(3.142, example1.circumference(), DELTA);   
   }
   
   /** 
   * Test for the surfaceArea method in Spherocylinder. 
   */
   @Test public void surfaceAreaTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25); 
      //example1.circumference();
      // expected, actual
      Assert.assertEquals(3.927, example1.surfaceArea(), DELTA);   
   }
   
   /** 
   * Test for the volume method in Spherocylinder. 
   */
   @Test public void volumeTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25); 
      // expected, actual
      Assert.assertEquals(0.72, example1.volume(), DELTA);   
   }
   
   /** 
   * Test for the count method in Spherocylinder. 
   */
   @Test public void countTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25); 
      // expected, actual
      Assert.assertEquals(12, example1.getCount());   
   }
   
   /** 
   * Test for the resetCount method in Spherocylinder. 
   */
   @Test public void resetCountTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      example1.resetCount();
      Assert.assertEquals(0, example1.getCount());   
   }
   
   /** 
   * Test for the equal method in Spherocylinder. 
   */
   @Test public void equalsTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(true, example1.equals(example2));   
   }
   
   /** 
   * Test for the toString method in Spherocylinder. 
   */
   @Test public void toStringTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      String toString = example1.toString();
      Assert.assertTrue(toString.contains("Small Example"));   
   } 
   
   /** 
   * Test for the toString method in Spherocylinder. 
   */
   @Test public void hashCodeTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(0, example1.hashCode());   
   }
}

