import java.util.Scanner;
public class AverageofTwo
 {
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter num1:");

      double num1 = sc.nextDouble();

      System.out.println("Enter num2:");
      
      double num2 = sc.nextDouble();
  
      double sum = 0.0;
      double avg = 0.0;
  
      sum = num1 + num2;

      avg = sum/2;

      System.out.println("Average of two numbers is " + avg );

    }
  }
