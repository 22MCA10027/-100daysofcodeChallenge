import java.util.Scanner;

public class MilestoKilometers
 {

   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the Miles: ");
      double miles = sc.nextDouble();
      double kilometers = miles * 1.6093434;

      System.out.println("Distance in Miles: "  + miles + " Miles");
      System.out.println("Distance in KiloMeters: "  + kilometers + " KiloMeters");
      
      sc.close();
   }
}
