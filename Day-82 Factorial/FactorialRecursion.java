import java.util.Scanner;

public class FactorialRecursion
 {

   public static long findFactorial(int n)
   {
      return (n==0) ? 1 : n*findFactorial(n-1);
   }

   public static void main(String[] args)
   {

      int number = 0;
      long result = 0;

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter an integer number:: ");

      number = sc.nextInt();

      result = findFactorial(number);

      System.out.println("Factorial = "+ result);

      sc.close();
   }
}
