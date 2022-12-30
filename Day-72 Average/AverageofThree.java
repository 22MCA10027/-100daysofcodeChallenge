import java.util.Scanner;
public class AverageofThree
 {
    public static void main(String[] args) 
    {
  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1:");

        double num1 = sc.nextDouble();

        System.out.println("Enter num2:");

        double num2 = sc.nextDouble();

        System.out.println("Enter num3:");

        double num3 = sc.nextDouble();

        double sum = 0.0;
        double avg = 0.0;

        sum = num1 + num2 + num3;
    
        avg = sum/3;
  
      System.out.println("Average of three numbers is: " + avg );
    }
  }
