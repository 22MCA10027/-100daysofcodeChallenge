import java.util.Scanner;

public class SpecialNumber {

   public static boolean isSpecial(int number)
    {
      int sum = 0, lastDigit = 0;
      int tempNum = number;
 
      while(tempNum != 0) {
          lastDigit = tempNum % 10;
          sum += factorial(lastDigit);
          tempNum /= 10;
      }

      if(sum == number)
          return true; 
      return false; 
   }

   public static long factorial(int n) {
      long fact = 1;
      for(int i=1; i<=n; i++) {
          fact *= i;
      }
      return fact;
   }

   public static void main(String[] args) {

      int number = 0;
      boolean result = false;

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter an integer number::");
      number = scan.nextInt();

      result = isSpecial(number);

      if(result)
          System.out.println(number +   " is a Special number.");
      else
          System.out.println(number +" is not a Special number.");

      scan.close();
   }
}
