import java.util.Scanner;

public class NumberFactors
 {

   public static void findFactor(int n) 
   {
       for(int i=1; i <= n; i++) 
       {
           if(n % i == 0)
           System.out.print(i+"\t");
       }
   }

   public static void main(String[] args)
    {

       int number = 0;

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter a number:: ");
       number = sc.nextInt();
 
       System.out.print("The factors of the number are:: ");
       findFactor(number);

       sc.close();
   }
}
