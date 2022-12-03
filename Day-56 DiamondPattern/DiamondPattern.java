import java.util.Scanner;

public class DiamondPattern
 {
   public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = 0;
      System.out.print("Enter N value:: ");
      n = sc.nextInt();
      printStartDiamond(n);
   }
    private static void printStartDiamond(int n)
    {
      if(n <= 0)
      System.out.println("Enter Positive Number");
        for(int i=1; i<=n; i++)
       {
        for(int j = i; j<=n; j++) 
        {
            System.out.print(" ");
         }
         for(int k = 1; k <= 2*i-1; k++) 
         {
            System.out.print("*");
         }
         System.out.println();
      }
      for(int i=n-1; i >=1; i--) 
      {
         for(int j=n; j >= i; j--) 
         {
            System.out.print(" ");
         }
         for(int k=1; k <= 2*i-1; k++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
