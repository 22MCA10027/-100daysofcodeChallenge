import java.util.Scanner;

public class DiamondPatternn
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int n = 0;
      System.out.print("Enter N value:: ");
      n = scan.nextInt();
      printNumberDiamond(n);
   }
   private static void printNumberDiamond(int n) 
   {
      if(n <= 0)
      System.out.println("Enter Positive Number");
      int a = 0;
      for(int i=1; i <= n+1; i++)
      {
         for(int j = i; j <= n; j++)
         {
            System.out.print(" ");
         }
         for(int k = 1; k <= 2*i-1; k++) 
         {
            if(k < i)
            System.out.print(a++);
            else if(k == i)
            System.out.print(a);
            else
            System.out.print(--a);
         }
         System.out.println();
      }
      for(int i=n; i >= 1; i--)
      {	 
         for(int j=n; j >= i; j--)
         {
            System.out.print(" ");
         }
         for(int k=1; k <= 2*i-1; k++)
         {
            if(k < i)
            System.out.print(a++);
            else if(k == i)
            System.out.print(a);
            else
            System.out.print(--a);
         }
         System.out.println();
      }
   }

}
