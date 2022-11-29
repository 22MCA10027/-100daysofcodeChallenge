import java.util.Scanner;
public class Distance
 {
  public static void main(String[] args) 
  {

    Scanner sc = new Scanner(System.in);

    int x1, x2, y1, y2, x, y;
    double distance;

    System.out.print("Enter first point the coordinates: ");
    x1 = sc.nextInt();
    y1 = sc.nextInt();
    System.out.print("Enter second point the coordinates: ");
    x2 = sc.nextInt();
    y2 = sc.nextInt();

    x = x2-x1;
    y = y2-y1;
    distance = Math.sqrt(x*x + y*y);

    System.out.println("Distance between them = " + distance);
  }
}
