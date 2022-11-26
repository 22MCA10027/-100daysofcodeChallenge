
import java.util.Scanner;
public class SumofSeriesofNN
 {
  public static void main(String[] args) 
  {

    Scanner sc = new Scanner(System.in);

    int n;
    int sum = 0;

    System.out.print("Enter N value: ");
    n = sc.nextInt();

    for(int i=1; i<=n; i++)
     {
      sum = sum + i*i;
    }

    System.out.println("Sum of Series is = " + sum); 
  }

}
