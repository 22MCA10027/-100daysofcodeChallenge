import java.util.Scanner;

public class Mortgage 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      
      double principle = 0.0;
      double rate = 0.0;
      double time = 0.0;
      double payment = 0.0;
      
      System.out.print("Enter Principal Amount: ");
      principle = sc.nextDouble();
      System.out.print("Enter Interest Rate: ");
      rate = sc.nextDouble();
      System.out.print("Enter Time (in years): ");
      time = sc.nextDouble();
      
      payment = calculator(principle, rate, time);
      
      System.out.println("Monthly Payment = " + payment);
      
      sc.close();
   }
   
   public static double calculator(double principle, double rate,  double time) 
   {
      rate = (rate/100)/12;
      
      time = time * 12;
      
      double payment = principle * (  (rate * Math.pow(1+rate, time)) / (Math.pow(1+rate, time) - 1) ); 
      return payment;
   }
}
