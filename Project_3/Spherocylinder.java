import java.text.DecimalFormat;

/** 
*Class representing a Spherocylinder object. 
*With Comparable interfacde implemented. 
*/

public class Spherocylinder implements Comparable<Spherocylinder> {

   private String label = ""; 
   private double radius = 0, height = 0;
  //class variable
   private static int count = 0; 
   
   /**
   *constructor.
   *@param labelIn label
   *@param radiusIn radius
   *@param heightIn height
   */
   public Spherocylinder(String labelIn, double radiusIn,
      double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(heightIn); 
      count++;
   }
   
   /**
   *getCount gets total number of objects created.
   *@return count
   */
   public static int getCount() {
      return count; 
   
   }
   
   /**
   *resetCount set's count to zero.
   */
   public static void resetCount() {
      count = 0; 
   
   }
   
   /**
   *getLabel gets the instance variable label.
   *@return label
   */
   public String getLabel() {
      return label; 
   
   }
   
  /**
  *setLabel sets the instance variable label.
  *@param labelIn to set instnace variable
  *@return true/false
  */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else { 
         return false;
      }
   }
     
   /**
   *getRadius gets the instance variable radius.
   *@return radius
   */
   public double getRadius() {
      return radius;
   }
     
    /**
    *setRadius set the instance variable radius.
    *@param radiusIn to set radius
    *@return true/false
    */
   public boolean setRadius(double radiusIn) {
      if (radiusIn >= 0) {
         radius = radiusIn;
         return true;
      }
      else { 
         return false;
      }     
   }
     
    /**
    *getCylinderHeight gets the instance variable height.
    *@return height
    */
   public double getCylinderHeight() {
      return height;
   }
     
    /**
    *setCylinderHeight sets the instance variable height.
    *@param heightIn height
    *@return true/false
    */
   public boolean setCylinderHeight(double heightIn) {
      if (heightIn >= 0) {
         height = heightIn;
         return true;
      }
      else { 
         return false;
      } 
   }
     
    /**
    *method to return the circumference.
    *@return circumference
    */
   public double circumference() {
      return (2 * Math.PI * radius);
   }
     
    /**
    *method to return the surfaceArea.
    *@return area
    */
   public double surfaceArea() {
      return (circumference() * (2 * radius + height));
   }
     
    /**
    *method to return the volume.
    *@return double
    */
   public double volume() {
      //correct
      double value1 = (Math.PI * Math.pow(radius, 2));
      double value2 = 4.0 / 3.0;
      return value1 * (((value2 * radius) + height));
   }
   
    /**
    *method to verify if two objects are equal.
    *@param obj is the object to be tested. 
    *@return true/false
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) { 
         return false;
      }
      else {
         Spherocylinder d = (Spherocylinder) obj; 
         return (label.equalsIgnoreCase(d.getLabel()) 
               && Math.abs(radius - d.getRadius()) < .000001 
               && Math.abs(height - d.getCylinderHeight()) < .000001);
      } 
   }
   
    /**
    *method for checkstyle.
    *@return int
    */
   public int hashCode() {
      return 0;
   }
   
    /**
    *campareTo implementation for the Comparable interface. 
    *@param obj Sherocylinder object
    *@return int
    */
   public int compareTo(Spherocylinder obj) {
    
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0;
      }
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      else {
         return 1;
      }
      
   }
        
    /**
    *method to diplay object desciption.
    *@return double
    */
   public String toString() {
   
      DecimalFormat decFormat = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label + "\" with radius " 
         + decFormat.format(radius) + " and cylinder height " 
         + decFormat.format(height) + " has:";
      output += "\n\tcircumference = " + decFormat.format(circumference()) 
          + " units";
      output += "\n\tsurface area = " + decFormat.format(surfaceArea()) 
         + " square units";
      output += "\n\tvolume = " + decFormat.format(volume()) + " cubic units";
      return output;
   }
}