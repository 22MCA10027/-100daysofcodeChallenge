// series:- 1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 +. . .+ 1/N
import java.util.Scanner;
public class SumofSeriess 
{
  public static void main(String[] args) 
  {

    Scanner sc = new Scanner(System.in);

    int n;
    double sum = 0.0;

    System.out.print("Enter the value of N ");
    n = sc.nextInt();

    for(int i=1; i<=n; i++) 
    {
      sum = sum + (1 /(double)i);
    }

    System.out.println("Sum of series is  " + sum);
  }
}
