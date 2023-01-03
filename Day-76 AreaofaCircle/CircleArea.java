import java.util.Scanner;

public class CircleArea 
{

   public static void main(String[] args) 
   {

      double radius = 0.0;
      double area = 0.0;

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the radius of circle:: ");
      radius = sc.nextDouble();

      area = Math.PI * radius * radius;

      System.out.println("Area of circle = "+area);

      sc.close();
   }
}
