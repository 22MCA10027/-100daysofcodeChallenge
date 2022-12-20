import java.util.Scanner;
public class InvertPyramid 
{

   public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int n = 0;

      System.out.print("Enter number of rows:: ");
      n = scan.nextInt();

      for (int i=1; i <= n; i++) 
      {

         for(int j=1; j < 2*n; j++)
         if(j < i)
         System.out.print(" "); 
         else if(j <= 2*n-i)
         System.out.print("*"); 
	 
         System.out.println();
      }
   }
}
