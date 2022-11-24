import java.util.Scanner;
public class FibonacciSeriesR
 {
   public static int fibonacci(int n) 
   {
      return (n<=1) ? n : 
	  (fibonacci(n-1) + fibonacci(n-2) );
   }

   public static void main(String[] args)
   {
      int term; 

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the term ");
      term = sc.nextInt();

      System.out.println("First "+term+" terms of "+  "Fibonacci series are: ");

      for(int i=1; i<term; i++) 
         System.out.print(fibonacci(i)+"\t");

      sc.close();
   }
}
