import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.FileNotFoundException;

 /** 
 * Test for UseTaxList Class. 
 **/
public class UseTaxListTest {
    
   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   
   }
   
   /** 
   * Test for readVehicleFile - Exception. 
   * @throws Exception if file not found. 
   */
   @Test public void readVehicleFileExceptionTest() throws Exception {
      try {
         UseTaxList testList = new UseTaxList();
         String nonExistingFilename = "NonExisting.txt";
         testList.readVehicleFile(nonExistingFilename);
         //fail("should throw file not found exception"); 
      } catch (FileNotFoundException e) {
            // expected
      }
   }   
   
    /**
    * Test getTaxDistrict method.
    * @throws IOException when file not read.
    */
   @Test public void getTaxDistrictTest() throws IOException {
      String output = "Tax District 54";
      UseTaxList taxList = new UseTaxList();
      try {
         taxList.readVehicleFile("vehicles1.txt");
         taxList.setTaxDistrict("Tax District 54");
         Assert.assertEquals(output, taxList.getTaxDistrict());
      }
      catch (NegativeValueException e) { 
      } 
   }

   /**
    * Test getExcludedRecords method.
    * @throws IOException when file not read.
    */
   @Test public void getExcludedRecordsTest() throws IOException {
      UseTaxList taxList = new UseTaxList();
      UseTaxList taxList2 = new UseTaxList();
      try {
         taxList2.readVehicleFile("vehicles1.txt");
         taxList.readVehicleFile("vehicles1.txt");
         Assert.assertEquals(taxList.getExcludedRecords(),
            taxList2.getExcludedRecords());
      }
      catch (NegativeValueException e) { 
      }  
   }

   /**
    * Test getVehicleList method.
    * @throws IOException when file not read.
    */
   @Test public void getVehicleListTest() throws IOException {
      UseTaxList taxList = new UseTaxList();
      try {
         taxList.readVehicleFile("vehicles1.txt");
         Vehicle[] output = taxList.getVehicleList();
         Assert.assertEquals(taxList.getVehicleList(), output);
      }
      catch (NegativeValueException e) { 
      }
   }  

   /**
    * Tests the toString method.
    * @throws IOException when file not read.
    */
   @Test public void toStringTest() throws IOException {
      UseTaxList taxList = new UseTaxList();
      try {
         taxList.readVehicleFile("vehicles1.txt");
         String output = taxList.toString();
         Assert.assertEquals(output, taxList.toString());
      }
      catch (NegativeValueException e) { 
      }
   }
   
   /**
    * Tests the calculateTotalUseTax method.
    * @throws IOException when file not read.
    */
   @Test public void calculateTotalUseTaxTest() throws IOException {
      UseTaxList taxList = new UseTaxList();
      try {
         taxList.readVehicleFile("vehicles1.txt");
      }
      catch (NegativeValueException e) { 
      }
      double total = 0.0;
      Vehicle[] test = taxList.getVehicleList();
      for (int i = 0; i < test.length; i++) {
         total += test[i].useTax();
      }
      double output = taxList.calculateTotalUseTax();
      Assert.assertEquals(output, total, 0.0001);
   }

   /**
    * Tests the calculateTotalValue method.
    * @throws IOException when file not read.
    */
   @Test public void calculateTotalValueTest() throws IOException {
      UseTaxList taxList = new UseTaxList();
      try {
         taxList.readVehicleFile("vehicles1.txt");
      }
      catch (NegativeValueException e) { 
      }
      double total = 0.0;
      Vehicle[] test = taxList.getVehicleList();
      for (int i = 0; i < test.length; i++) {
         total += test[i].getValue();
      }
      double output = taxList.calculateTotalValue();
      Assert.assertEquals(output, total, 0.0001);
   }

   /**
    * Tests the summary method.
    * @throws IOException when file not read.
    */
   @Test public void summaryTest() throws IOException {
      UseTaxList taxList = new UseTaxList();
      try {
         taxList.readVehicleFile("vehicles1.txt");
      }
      catch (NegativeValueException e) { 
      }
      String output = "------------------------------" + "\n" 
         + "Summary for vehicleTax District 52" + "\n" 
         + "------------------------------" + "\n";
      output += "Number of Vehicles: 8\nTotal Value: ";
      output += "$393,000.00\nTotal Use Tax: $12,010.00";
      Assert.assertEquals(output,
         taxList.summary());
   }

   /**
    * Test listByOwner method.
    * @throws IOException when file not read.
    */
   @Test public void listByOwnerTest() throws IOException {
      UseTaxList taxList = new UseTaxList();
      try {
         taxList.readVehicleFile("vehicles1.txt");
         String output = taxList.listByOwner();
         Assert.assertEquals(output, taxList.listByOwner());
      }
      catch (NegativeValueException e) { 
      }
   }
  
   /**
    * Test listByUseTax method.
    * @throws IOException when file not read.
    */
   @Test public void listByUseTax() throws IOException {
      UseTaxList taxList = new UseTaxList();
      try {
         taxList.readVehicleFile("vehicles1.txt");
         String output = taxList.listByUseTax();
         Assert.assertEquals(output, taxList.listByUseTax());
      }
      catch (NegativeValueException e) { 
      }
   }

   /**
    * Tests the excludedRecordsList method.
    * @throws IOException when file not read.
    */
   @Test public void excludedRecordsListTest() throws IOException {
      UseTaxList taxList = new UseTaxList();
      try {
         taxList.readVehicleFile("vehicles1.txt");
      }
      catch (NegativeValueException e) { 
      }
      Assert.assertTrue(taxList.toString().contains("")); 
   }  
   
    /**
    * Test addVehichle method.
    * @throws IOException when file not found.
    */
   @Test public void addVehichleTest() throws IOException {
      UseTaxList taxList = new UseTaxList();
      String owner = "Guy, This";
      String yearMakeModel = "2005 Pontiac Sunfire";
      double value = 2000.00;
      boolean alt = false;
      try {
         Car tmpCar = new Car(owner, yearMakeModel, value, alt);
         taxList.addVehicle(tmpCar);
         Vehicle[] tmpList = taxList.getVehicleList();
         Assert.assertEquals(tmpCar, tmpList[0]);
      }
      catch (NegativeValueException e) { 
      }
   } 
   
    /**
    * Test addExcludedRecord method.
    * @throws IOException when file not found.
    */
   @Test public void addExcludedRecordTest() throws IOException {
      UseTaxList taxList = new UseTaxList();
      String line = "race car; Zinc, Zed; 2013 Custom Hot Rod; 61000; false";
      taxList.addExcludedRecord(line);
      String[] exList = taxList.getExcludedRecords();
      Assert.assertEquals(line, exList[0]);
   }
}


