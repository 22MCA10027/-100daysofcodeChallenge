import java.util.Scanner;

public class Swappingoftwo
 {
   public static void main(String[] args)
    {
      int x, y;
      int temp;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter any two numbers: ");
      x = sc.nextInt();
      y = sc.nextInt();

      System.out.println("Values before Swapping,");
      System.out.println("x="+x+"\t y="+y);

      temp = x;
      x = y;
      y = temp;

      System.out.println("Values After Swapping,");
      System.out.println("x="+x+"\t y="+y);

      sc.close();
   }
}
