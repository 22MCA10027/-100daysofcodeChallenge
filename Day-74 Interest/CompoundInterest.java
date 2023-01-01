import java.util.Scanner;

public class CompoundInterest 
{
   public static void main(String[] args) 
   {

       double principal = 0.0, rate = 0.0, time = 0.0;
       int number = 0;
       double totalAmount = 0.0, cinterest = 0.0;

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter principal amount:: ");
       principal = sc.nextDouble();
       System.out.print("Enter the annual compound " + "interest rate:: ");
       rate = sc.nextDouble();
       rate = rate/100; 
       System.out.print("Enter time (in years):: ");
       time = sc.nextDouble();
       System.out.print("Enter the number of times that "+ "interest is compounded per year:: ");
       number = sc.nextInt();

       totalAmount = principal * Math.pow( 1+(rate/number), number*time);

       cinterest = totalAmount - principal;

       System.out.println("Compound interest = "+ cinterest);
       System.out.println("Total amount = "+ totalAmount);

       sc.close();
   }
}
