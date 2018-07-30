/** 
*Class representing VehiclesPart1 objects.
*/

public class VehiclesPart1 {

   /**
   *main function. 
   @param args -- (not used).
   */
   public static void main(String[] args) {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false); 
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true); 
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
         110000, false);
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
            110000, true);
      
      System.out.print("\t\t\t Vehicles \n\t\t\t----------\n\n");
      System.out.println("Car1:");
      System.out.println(car1);
      System.out.println("Car2:");
      System.out.println(car2);
      System.out.println("Car3:");
      System.out.println(car3);
      System.out.println("Car4:");
      System.out.println(car4);
      
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
         30000, false, 1.5);
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack", 
         40000, true, 2.5);
      
      System.out.println("Truck1:");
      System.out.println(truck1 + "\n");
      System.out.println("Truck2:");
      System.out.println(truck2 + "\n");
      
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, false, 5.0, 4);
      SemiTractorTrailer semi2 = new SemiTractorTrailer("Pederson, Bill",
          "2015 Peterbuilt Stallion", 85000, false, 5.0, 4);
      
      System.out.println("SemiTractorTrailer1:");
      System.out.println(semi1 + "\n");
      System.out.println("SemiTractorTrailer2:");
      System.out.println(semi2 + "\n");
      
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster", 14000, false, 750);
      Motorcycle bike2 = new Motorcycle("Dean, James",
            "1962 Triumph Bonneville ", 23000, false,  865);
      System.out.println("Motocycle1:");
      System.out.println(bike1 + "\n");
      System.out.println("Motocycle2:");
      System.out.println(bike2 + "\n");
   }
   
}