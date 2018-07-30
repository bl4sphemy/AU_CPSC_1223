
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /** 
 * Test program Template. 
 **/
public class SpherocylinderListTest {

   private Spherocylinder example1 = new Spherocylinder("Small Example", 
      0.5, 0.25);
   private Spherocylinder example2 = new Spherocylinder("Medium Example", 
      10.8, 10.1); 
   private Spherocylinder example3 = new Spherocylinder("Large Example", 
      98.32, 99.0);
   private Spherocylinder[] tempArr = {example1, example2, example3};
   
   private static final double DELTA = 1e-15;

   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   
    /** 
    * getNameTest test method.
    */
   @Test public void getNameTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3); 
      Assert.assertEquals("test", sArray.getName());
   }
   
    /** 
    * numberOfSpherocylindersTest test method.
    */
   @Test public void numberOfSpherocylindersTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3); 
      Assert.assertEquals(3, sArray.numberOfSpherocylinders());
   }
   
    /** 
    * totalSurfaceAreaTest test method.
    */
   @Test public void totalSurfaceAreaTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3); 
      Assert.assertEquals(184790.42641495977, sArray.totalSurfaceArea(), DELTA);
   }
   
    /** 
    * totalVolumeTest test method.
    */
   @Test public void totalVolumeTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3); 
      Assert.assertEquals(6996733.04095263, sArray.totalVolume(), DELTA);
   }
   
    /** 
    * averageSurfaceAreaTest test method.
    */
   @Test public void averageSurfaceAreaTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3); 
      Assert.assertEquals(61596.80880498659,
          sArray.averageSurfaceArea(), DELTA);
   }
   
    /** 
    * averageVolumeTest test method.
    */
   @Test public void averageVolumeTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3); 
      Assert.assertEquals(2332244.34698421, sArray.averageVolume(), DELTA);
   }
      
   /** 
   * Test for the toString method. 
   */
   @Test public void toStringTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3);
      SpherocylinderList sArray2 = new SpherocylinderList("test", tempArr, 3);
      String compare = sArray.toString();
      String result = sArray2.toString();
      Assert.assertEquals(result, compare);   
   }
   
   /** 
   * getListTest test method.
   */
   @Test public void getListTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3);
      Spherocylinder[] tmp = sArray.getList();
      Assert.assertArrayEquals(tmp, tempArr); 
   }
   
    /** 
    * addSpherocylinderTest test method.
    */
   @Test public void addSpherocylinderTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3);
      sArray.addSpherocylinder("List Test", 1, 2);
      Assert.assertEquals(4, sArray.numberOfSpherocylinders());
   } 
   
   /** 
   * findSpherocylinderTest test method.
   */
   @Test public void findSpherocylinderTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3);
      Spherocylinder sc = sArray.findSpherocylinder("Small Example");
      Assert.assertEquals(sc, sArray.findSpherocylinder("Small Example"));
   } 
   
   /** 
   * findSpherocylinderTest2 test method.
   */
   @Test public void findSpherocylinderTest2() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3);
      Assert.assertEquals(null, sArray.findSpherocylinder("blah"));
   } 
    
    /** 
    * deleteSpherocylinderTest test method.
    */
   @Test public void deleteSpherocylinderTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3);
      sArray.deleteSpherocylinder("Small Example");
      Assert.assertEquals(2, sArray.numberOfSpherocylinders());
   }
   
    /** 
    * deleteSpherocylinderTest2 test method.
    */
   @Test public void deleteSpherocylinderTest2() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3);
      Assert.assertEquals(null, sArray.deleteSpherocylinder("salad"));
   }  
   
    /** 
    * editSpherocylinderTest test method.
    */
   @Test public void editSpherocylinderTest() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3);
      boolean test = sArray.editSpherocylinder("Small Example", 5, 25);
      Assert.assertEquals(true, test);
   }  
   
    /** 
    * editSpherocylinderTest2 test method.
    */
   @Test public void editSpherocylinderTest2() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3);
      boolean test = sArray.editSpherocylinder("snap", 5, 25);
      Assert.assertEquals(false, test);
   }  
   
    /** 
    * findSpherocylinderWithLargestVolumeTest test method.
    */
   @Test public void findSpherocylinderWithLargestVolume() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3);
      Spherocylinder sc = sArray.findSpherocylinderWithLargestVolume();
      System.out.println(sc);
      Assert.assertEquals(sc, sArray.findSpherocylinder("Large Example"));
   } 
   
    /** 
    * findSpherocylinderWithLargestVolumeTest2 test method.
    */
   @Test public void findSpherocylinderWithLargestVolume2() {
      SpherocylinderList sArray = new SpherocylinderList("test", tempArr, 3);
      sArray.editSpherocylinder("Small Example", 0, 0);
      sArray.editSpherocylinder("Medium Example", 0, 0);
      sArray.editSpherocylinder("Large Example", 0, 0);
      Assert.assertEquals(null, sArray.findSpherocylinderWithLargestVolume());
   }
}

