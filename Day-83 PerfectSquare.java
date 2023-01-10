import java.util.Scanner;

public class PerfectSquare 
{

   public static boolean isPerfectSquare(double number)
    {

      double root = Math.sqrt(number);

      return (root - Math.floor(root) == 0);
   }

   public static void main(String[] args) {

      double number = 0.0;
      boolean result = false;

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter any number::");
      number = sc.nextDouble();

      result = isPerfectSquare(number);

      if(result)
         System.out.println("Perfect Square");
      else
         System.out.println("Not a Perfect Square");

      sc.close();
   }
}
