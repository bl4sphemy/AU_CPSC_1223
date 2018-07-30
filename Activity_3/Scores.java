/** 
*Class to store an array of numbers. 
*/
public class Scores {

   private int[] numbers;
   
   /** 
   *Constructor. 
   *@param numbersIn values to store in the numbers[]
   */ 
   public Scores(int[] numbersIn) {
      numbers = numbersIn;  
   }
   
   /** 
   *findEvens returns an array with the even set of numbers.  
   *@return null
   */ 
   public int[] findEvens() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) { 
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }  
      }
      int[] evens = new int[numberEvens];
      int count = 0; 
      for (int j = 0; j < numbers.length; j++) {
         if (numbers[j] % 2 == 0) {
            evens[count] = numbers[j];
            count++; 
         } 
      }
      return evens;
   }  
   
   /** 
   *findEvens returns an array with the even set of numbers. 
   *@return null
   */ 
   public int[]  findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) { 
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }  
      }
      int[] odds = new int[numberOdds];
      int count = 0; 
      for (int j = 0; j < numbers.length; j++) {
         if (numbers[j] % 2 == 1) {
            odds[count] = numbers[j];
            count++; 
         } 
      }
      return odds;
   }
   
   /** 
   *calculateAverage method calculates the avg off all elements in the 
   *  numbers array. 
   *@return double
   */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i]; 
      }
      return (double) (sum / numbers.length);
   }
   
   /** 
   *Standard class toString.
   *@return result
   */ 
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t"; 
      }
      return result;
   }
   
   /** 
   *toStringReverse outputs the reults of toString in reversed. 
   *@return null
   */ 
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
}