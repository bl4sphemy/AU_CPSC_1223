import java.text.DecimalFormat;

/** 
*Class for a spherocylinder object.
*/
public class SpherocylinderList {
   
   private String listName = "";
   private Spherocylinder[] sList; 
   private int elements = 0;
   
    /** 
    *Some javadoc comment here.
    *@param nameIn name of list
    *@param arrayIn array of spherocylinders being passed 
    *@param elementsIn number of elements in array
    */
   public SpherocylinderList(String nameIn, 
      Spherocylinder[] arrayIn, int elementsIn) {
      listName = nameIn;
      sList = arrayIn;
      elements = elementsIn; 
   }
   
    /** 
    *getName.
    *@return listName
    */
   public String getName() {
      return listName;
   }
    
    /** 
    *numberOfSpherocylinders.
    *@return int
    */
   public int numberOfSpherocylinders() {
      return elements; 
   }
   
    /** 
    *totalSurfaceArea.
    *@return sum
    */
   public double totalSurfaceArea() {
      double sum = 0.0;
      for (int i = 0; i < elements; i++) {
         sum += sList[i].surfaceArea();
      }
      return sum;
   }
   
    /** 
    *totalVolume.
    *@return sum
    */
   public double totalVolume() {
      double sum = 0.0;
      for (int i = 0; i < elements; i++) {
         sum += sList[i].volume();
      }
      return sum;
   }
    
    /** 
    *averageSurfaceArea.
    *@return double
    */
   public double averageSurfaceArea() {
      double sum = totalSurfaceArea() / elements;
      return sum;
   }
   
    /** 
    *averageVolume.
    *@return double
    */
   public double averageVolume() {
      double sum = totalVolume() / elements;
      return sum; 
   }
   
    /** 
    *toString.
    *@return output
    */
   public String toString() {
      DecimalFormat decFormat = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for Spherocylinder Test List -----" 
         + "\n" + "Number of Spherocylinders: " 
         + elements + "\n" + "Total Surface Area: "   
         + decFormat.format(totalSurfaceArea()) + "\n";
      output += "Total Volume: " + decFormat.format(totalVolume()) + "\n";
      output += "Average Surface Area: " 
         + decFormat.format(averageSurfaceArea()) + "\n";
      output += "Average Volume: " + decFormat.format(averageVolume()) + "\n";
      return output;
   
   }
   
    /** 
    *getList.
    *@return sList
    */
   public Spherocylinder[] getList() {
      return sList;
   }
   
    /** 
    *addSpherocylinder.
    *@param labelIn label spherocylinder 
    *@param radiusIn radius value for object
    *@param heightIn sets the height of spherocylinder obj
    */
   public void addSpherocylinder(String labelIn, int radiusIn, int heightIn) {
      if (labelIn != null) {
         Spherocylinder  tempObj = new Spherocylinder(labelIn, 
            radiusIn, heightIn); 
         int size = elements + 1;
         Spherocylinder [] tempArray = new Spherocylinder[size];
         for (int i = 0; i < elements; i++) {
            tempArray[i] = sList[i];
         }
         tempArray[size - 1] = tempObj;
         elements++;
         sList = tempArray;  
      }
   }  
     
    /** 
    *findSpherocylinder.
    *@return null
    *@param labelIn name of sc to find
    */
   public Spherocylinder findSpherocylinder(String labelIn) {
      Spherocylinder temp = null;
      boolean found = false;
      
      for (int i = 0; i < elements; i++) { 
      //for (Spherocylinder tmp : sList) {
         if (labelIn != null) {
            if (sList[i].getLabel().toUpperCase()
               .equals(labelIn.toUpperCase())) {
               temp = sList[i];
               found = true;
            }
         }
      }
      if (found) {
         return temp;
      }
      else {
         return null;
      }
   }
   
    /** 
    *deleteSpherocylinder.
    *@return null
    *@param labelIn name of sc to find
    */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
      Spherocylinder tmpObj = null;
      Spherocylinder[] newArr = new Spherocylinder[sList.length - 1];
      boolean found = false;
      int index = 0; 
      if (labelIn != null) {
         for (int i = 0; i < elements; i++) {
            if (sList[i].getLabel().toUpperCase()
               .equals(labelIn.toUpperCase())) {
               found = true;
               tmpObj = sList[i];
               index = i;
               sList[i] = null;
            }
         }
         for (int j = 0; j < index; j++) {
            if (sList[j] != null) {
               newArr[j] = sList[j];
            }   
         }
         for (int k = index; k < elements - 1; k++) {
            if (k < elements) {
               newArr[k] = sList[k + 1];
            }
         }
      }
      if (found) {
         elements--;
         sList = newArr;
         return tmpObj; }
      else {
         return null; }
   }  
        
    /** 
    *editSpherocylinder.
    *@param labelIn label spherocylinder 
    *@param radiusIn radius value for object
    *@param heightIn sets the height of spherocylinder obj
    *@return boolean
    */
   public boolean editSpherocylinder(String labelIn, int radiusIn,
       int heightIn) {
      boolean edited = false;
      if (labelIn != null) {
         for (int i = 0; i < elements; i++) {
         //for (Spherocylinder tmp : sList) {
            if (sList[i].getLabel() == labelIn) {
               sList[i].setRadius(radiusIn);
               sList[i].setCylinderHeight(heightIn);
               edited = true;
            }
         }
      }
      return edited; 
   }
   
    /** 
    *findSpherocylinderWithLargestVolume.
    *@return null
    */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      Spherocylinder temp = null;
      double num = 0.0;
      for (int i = 0; i < elements; i++) {
         if (sList[i].volume() > num) {
            num = sList[i].volume();
            temp = sList[i];  
         }
      }
      if (num != 0.0) {
         return temp;
      }
      else {
         return null;
      }
   }
}

