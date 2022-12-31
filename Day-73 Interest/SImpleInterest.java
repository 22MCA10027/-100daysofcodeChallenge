import java.util.Scanner;
 
public class SimpleInterest 
{
   public static void main(String[] args) 
   {

       double principalAmount = 0.0; 
       double rate = 0.0;
       double time = 0.0;
       double interest = 0.0;

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter principal amount:: ");
       principalAmount = sc.nextDouble();
       System.out.print("Enter time (in months):: ");
       time = sc.nextDouble();
       System.out.print("Enter  the  interest rate (per year):: ");
       rate = sc.nextDouble();
       interest = (principalAmount * rate * time) / 100;

       System.out.println("Simple interest = "+interest);
       System.out.println("Total amount to pay = "+ (principalAmount+interest));

       sc.close();
   }
}
