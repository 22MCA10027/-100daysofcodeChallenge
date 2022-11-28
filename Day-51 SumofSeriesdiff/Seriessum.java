// series:- 1/1! + 2/2! + 3/3! + …… + N/N!
import java.util.Scanner;
public class Seriessum 
{
  public static void main(String[] args) 
  {

    Scanner sc = new Scanner(System.in);

      int n;
    long factorial = 0;
    double sum = 0.0;

    System.out.print("Enter N value: ");
    n = scan.nextInt();

    for(int i=1; i<=n; i++)
     {
      factorial = findFactorial(i);
      sum = sum + (i / (double)factorial);
    }

    System.out.println("Sum of Series = " + sum);
  }

  public static long findFactorial(int number) 
  {
    if(number == 0) return 1;
    else 
    return number*findFactorial(number-1);
  }
}
