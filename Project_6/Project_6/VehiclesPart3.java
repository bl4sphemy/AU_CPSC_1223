import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
/** 
*Some javadoc comment here.
*/

public class VehiclesPart3 {
   
   /**
   main function. 
   @param args -- (not used).
   */

   public static void main(String[] args) {
   
      if (args.length == 0) {
         System.out.println("*** File name not provided by command" 
            + " line argument. \nProgram ending.");
         System.exit(0);
      }
      UseTaxList tmpTaxList = new UseTaxList();
      try {
         tmpTaxList.readVehicleFile(args[0]);  
      }
      catch (FileNotFoundException ex) {
         ex.printStackTrace();
         System.out.println("*** File not found.\nProgram ending."); 
      }
      catch (NegativeValueException ex) {
         ex.printStackTrace();
      }
      catch (NoSuchElementException ex) {
         ex.printStackTrace();
      }
      System.out.println(tmpTaxList.summary());
      System.out.println("\n");
      System.out.println(tmpTaxList.listByOwner());
      System.out.println("\n");
      System.out.println(tmpTaxList.listByUseTax());
      System.out.println("\n");
      System.out.println(tmpTaxList.excludedRecordsList());
   }
}