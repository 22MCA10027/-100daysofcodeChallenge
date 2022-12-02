import java.util.Scanner;

public class TemperatureFartoCel 
{
  public static double toCelsius(double fahrenheit)
  {
     return ((5.0/9.0) * (fahrenheit - 32));
  }

  public static void main(String[] args) 
  {

     double celsius = 0.0;
     double fahrenheit = 0.0;

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Fahrenheit value::");
     fahrenheit = sc.nextDouble();

     celsius = toCelsius(fahrenheit);

     System.out.format("Celsius value = %.2f", celsius);

     sc.close();
  }
}
