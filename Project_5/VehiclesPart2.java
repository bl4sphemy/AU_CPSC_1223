import java.io.FileNotFoundException;

/**
*VehiclesPart2 Class file.
*/
public class VehiclesPart2 {

   /**
   main function
   @param args -- (not used).
   */
   public static void main(String[] args) {

      UseTaxList tmpTaxList = new UseTaxList();
      try {
         tmpTaxList.readVehicleFile("vehicle_1.txt");
      }
      catch (FileNotFoundException ex) {
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
