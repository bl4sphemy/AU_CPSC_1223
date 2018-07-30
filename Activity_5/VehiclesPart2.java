/** 
Some javadoc comment here
*/

public class VehiclesPart2 {
   
   /**
   main function 
   @param args -- (not used).
   */

   public static void main(String[] args) {
   
      String filename = args[0]; 
      //Scanner ticket = new Scanner(System.in);
      //System.out.println("Enter filename to open: ");
      //String filename = ticket.nextLine();
      UseTaxList tmpTaxList = new UseTaxList("",null, "");
      tmpTaxList.readVehicleFile("vehicles1.txt");
      System.out.println(tmpTaxList.toString);
   
   }
}