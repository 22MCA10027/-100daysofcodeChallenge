import java.util.Scanner;

public class DiamondPatterns 
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
      for(int i=1; i <= n; i++)
       {
         a = 1;
         for(int j = i; j <= n; j++)
         {
            System.out.print(" ");
         }
         for(int k = 1; k <= 2*i-1; k++)
         {
            System.out.print(a++);
         }
         System.out.println();
      }
      for(int i=n-1; i >= 1; i--) 
      {
         a = 1;	
         for(int j=n; j >= i; j--)
         {
            System.out.print(" ");
         }      
         for(int k=1; k <= 2*i-1; k++) 
         {
            System.out.print(a++);
         }
         System.out.println();
      }
   }
}
