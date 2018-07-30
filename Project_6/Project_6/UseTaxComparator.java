import java.util.Comparator;
/** 
*Creates UseTaxComparator object. 
*/

public class UseTaxComparator implements Comparator<Vehicle> {
   
/**
    * Compare method.
    * @param v1 the first vehicle
    * @param v2 the second vehicle
    * @return int representing greater, equal, or lessthan 
    */
   public int compare(Vehicle v1, Vehicle v2) {
      if (v1.useTax() > v2.useTax()) {
         return 1;
      }
      else if (v1.useTax() < v2.useTax()) {
         return -1;
      }
      return 0;
   }
}
