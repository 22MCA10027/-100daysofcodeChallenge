import java.util.Scanner;

public class TemperatureCeltoFor
 {

  private static double tofahrenheit(double celsius)
  {
     return ( celsius * (9.0/5.0) + 32 );
  }

  public static void main(String[] args) 
  {

   
     double celsius = 0.0;
     double fahrenheit = 0.0;

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Celsius value:: ");
     celsius = sc.nextDouble();

     fahrenheit = tofahrenheit(celsius);

     System.out.println("Fahrenheit value = " +fahrenheit);

     sc.close();
  }
}
