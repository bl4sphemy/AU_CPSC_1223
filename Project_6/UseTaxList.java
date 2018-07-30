import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

/**
*Creates UseTaxList objects.
*/
public class UseTaxList {

   private String taxDistrict;
   private Vehicle [] vehicleList;
   private String [] excludedRecords;

 /**
 *Constructor.
 */
   public UseTaxList() {
      taxDistrict = "not yet assigned";
      vehicleList = new Vehicle[0];
      excludedRecords = new String[0];
   }

 /**
 *Takes a file as a param and adds the records to vehicleList array.
 *@param fileIn file to read
 *@throws FileNotFoundException if file is invalid
 *@throws NegativeValueException if a numeric value is negative 
 *@throws NoSuchElementException if element is not found
 */
   public void readVehicleFile(String fileIn) 
      throws FileNotFoundException, NegativeValueException, 
         NoSuchElementException {
      String owner = "", yearMakeModel = "", doh = "";
      double value = 0.0, tons = 0.0;
      int axles = 0, count = 0, exCount = 0, engine = 0;
      boolean alt = false;
      String fileName = fileIn;
      //creating File
      File file = new File(fileIn);
      //Scanner to read file
      Scanner filescanner = new Scanner(file);
      taxDistrict = filescanner.nextLine().trim();
      String category = "";
      while (filescanner.hasNextLine()) {
         String line = filescanner.nextLine();
         //Scanner to parse line
         Scanner linescanner = new Scanner(line);
         linescanner.useDelimiter(";");
         while (linescanner.hasNext()) {
            category = linescanner.next().toUpperCase();
            char firstChar = category.charAt(0);
            if (firstChar != 'C' && firstChar != 'T' && firstChar != 'S'
                  && firstChar != 'M') {
               doh = "Invalid Vehicle Category in:\n"; 
            }
            switch(firstChar) {
               case 'C': //Car 
                  try {
                     owner = linescanner.next().trim();
                     yearMakeModel = linescanner.next().trim();
                     value = Double.parseDouble(linescanner.next().trim());
                     if (value < 0) {
                        NegativeValueException ex = 
                           new NegativeValueException();
                        addExcludedRecord(ex + " in:\n" + line);
                        exCount++;
                     }
                     else { 
                        alt = Boolean.parseBoolean(linescanner.next().trim());
                        Car tmpCar = new Car(owner, yearMakeModel, value, alt);
                        addVehicle(tmpCar);
                     }
                  }
                  catch (NegativeValueException ex) {
                     ex.printStackTrace();
                  }
                  catch (NumberFormatException  ex) {
                     ex.printStackTrace();
                  }
                  catch (NoSuchElementException  ex) {
                     ex.printStackTrace();
                  }
                  break;
               
               case 'T': //Truck
                  try {
                     owner = linescanner.next().trim();
                     yearMakeModel = linescanner.next().trim();
                     value = Double.parseDouble(linescanner.next()
                           .replaceAll("[^\\d.]", "").trim());
                     if (value < 0) {
                        NegativeValueException ex = 
                           new NegativeValueException();
                        addExcludedRecord(ex + " in:\n" + line);
                        exCount++;   
                     }
                     alt = Boolean.parseBoolean(linescanner.next().trim());
                     tons = Double.parseDouble(linescanner.next().trim());
                     if (tons < 0) {
                        NegativeValueException ex = 
                           new NegativeValueException();
                        addExcludedRecord(ex + " in:\n" + line);
                        exCount++;
                     }
                     if (value >= 0 && tons >= 0) {
                        Truck truck = new Truck(owner, yearMakeModel,
                           value, alt, tons);
                        addVehicle(truck);
                     }
                  }
                  catch (NegativeValueException ex) {
                     ex.printStackTrace();
                  }
                  catch (NumberFormatException  ex) {
                     ex.printStackTrace();
                  }
                  catch (NoSuchElementException  ex) {
                     ex.printStackTrace();
                  }
                  break;
               
               case 'S': //Semi
                  try {
                     owner = linescanner.next().trim();
                     yearMakeModel = linescanner.next().trim();
                     value = Double.parseDouble(linescanner.next().trim());
                     alt = Boolean.parseBoolean(linescanner.next().trim());
                     tons = Double.parseDouble(linescanner.next().trim());
                     axles = Integer.parseInt(linescanner.next().trim()
                           .replaceAll("[^\\d.]", "").trim());
                     if (axles < 0 || tons < 0 || value < 0) {
                        NegativeValueException ex = 
                           new NegativeValueException();
                        addExcludedRecord(ex + " in:\n" + line);
                        exCount++;
                     }
                     if (axles >= 0 && tons >= 0 && value >= 0) {
                        SemiTractorTrailer semi = new SemiTractorTrailer(owner,
                           yearMakeModel, value, alt, tons, axles);
                        addVehicle(semi);
                     }
                  }
                  catch (NegativeValueException ex) {
                     ex.printStackTrace();
                  } 
                  catch (NumberFormatException  ex) {
                     ex.printStackTrace();
                  } 
                  catch (NoSuchElementException  ex) {
                     ex.printStackTrace();
                  }  
                  break;
               
               case 'M': //Motorcycle
                  try {
                     owner = linescanner.next().trim();
                     yearMakeModel = linescanner.next().trim();
                     value = Double.parseDouble(linescanner.next().trim());
                     alt = Boolean.parseBoolean(linescanner.next().trim());
                     engine = Integer.parseInt(linescanner.next().trim());
                     if (engine < 0 || value < 0) {
                        NegativeValueException ex = 
                           new NegativeValueException();
                        addExcludedRecord(ex + " in:\n" + line);
                        exCount++;
                     }
                     else {
                        Motorcycle moto = new Motorcycle(owner, yearMakeModel,
                              value, alt, engine);
                        addVehicle(moto);
                     }
                  }
                  catch (NegativeValueException ex) {
                     ex.printStackTrace();
                  }
                  catch (NumberFormatException  ex) {
                     ex.printStackTrace();
                  } 
                  catch (NoSuchElementException  ex) {
                     ex.printStackTrace();
                  }    
                  break;
               
               default:
                  try {
                     String excludedLine = category + "; "
                        + linescanner.nextLine();
                     excludedLine = null;
                  }
                  catch (NoSuchElementException ex) {
                     ex.printStackTrace();
                  }
                  addExcludedRecord(doh + line);
                  exCount++;
                  break;
            }
         }
         linescanner.close();
      }
      filescanner.close();   
   }
   /**
   *Accessor for taxDistrict.
   *@return taxDistrict
   */
   public String getTaxDistrict() {
      return taxDistrict;
   }

   /**
   *Mutator for taxDistrict.
   *@param taxDistIn sets taxDistrict
   */
   public void setTaxDistrict(String taxDistIn) {
      taxDistrict = taxDistIn;
   }

   /**
   *Accessor for vehicleList.
   *@return vehicleList
   */
   public Vehicle[] getVehicleList() {
      return vehicleList;
   }

   /**
   *Accessor for excludedRecords.
   *@return excludedRecords
   */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }

   /**
   *Adds new vehichle object to array.
   *@param vehicleIn vehicle to add
   */
   public void addVehicle(Vehicle vehicleIn) {
      vehicleList = Arrays.copyOf(vehicleList,
         vehicleList.length + 1);
      vehicleList[vehicleList.length - 1] = vehicleIn;
   }

   /**
   *Adds new String to array.
   *@param exRecIn excludeRecord to add
   */
   public void addExcludedRecord(String exRecIn) {
      excludedRecords = Arrays.copyOf(excludedRecords,
         excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = exRecIn;
   }

    /**
    *toString override.
    *@return output
    */
   public String toString() {
      String output = "";
      for (int i = 0; i < vehicleList.length; i++) {
         output += vehicleList[i].toString() + "\n";
      }
      return output;
   }

   /**
   *Calculates the total tax.
   *@return totTax
   */
   public double calculateTotalUseTax() {
      double totTax = 0.0;
      for (Vehicle temp : vehicleList) {
         totTax += temp.useTax();
      }
      return totTax;
   }

   /**
   *Calculates the total value.
   *@return totVal
   */
   public double calculateTotalValue() {
      double totVal = 0.0;
      for (Vehicle temp : vehicleList) {
         totVal += temp.getValue();
      }
      return totVal;
   }

    /**
    *Prints summary.
    *@return output
    */
   public String summary() {
      DecimalFormat dec = new DecimalFormat("$#,##0.00");
      String output = "";
      output = "------------------------------" + "\n"
         + "Summary for " + taxDistrict.substring(0) + "\n"
         + "------------------------------" + "\n";
      output += "Number of Vehicles: " + vehicleList.length + "\n";
      output += "Total Value: " + dec.format(calculateTotalValue()) + "\n";
      output += "Total Use Tax: " + dec.format(calculateTotalUseTax());
      return output;
   }

   /**
   *Sorts vehichleList by tax.
   *@return output string
   */
   public String listByUseTax() {
      String output = "";
      Arrays.sort(vehicleList, new UseTaxComparator());
      output = "-----------------------------\n";
      output += "Vehicles by Use Tax" + "\n";
      output += "-----------------------------\n\n";
      for (int i = 0; i < vehicleList.length; i++) {
         if (i != vehicleList.length - 1) {
            output += vehicleList[i] + "\n\n";
         }
         else {
            output += vehicleList[i];
         }
      }
      return output;
   }

   /**
   *Sorts vehichleList by Owner.
   *@return output string
   */
   public String listByOwner() {
      String output = "";
      Arrays.sort(vehicleList);
      output = "-----------------------------\n";
      output += "Vehicles by Owner" + "\n";
      output += "-----------------------------\n\n";
      for (int i = 0; i < vehicleList.length; i++) {
         if (i != vehicleList.length - 1) {
            output += vehicleList[i] + "\n\n";
         }
         else {
            output += vehicleList[i];
         }
      }
      return output;
   }

    /**
    *Prints Excluded Records List.
    *@return output
    */
   public String excludedRecordsList() {
      String output = "";
      output = "------------------------------" + "\n"
         + "Excluded Records" + "\n"
         + "------------------------------" + "\n\n";
      for (int i = 0; i < excludedRecords.length; i++) {
         output += excludedRecords[i] + "\n\n";
      }
      return output;
   }
}
