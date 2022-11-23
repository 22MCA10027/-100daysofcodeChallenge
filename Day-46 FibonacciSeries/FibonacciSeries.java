import java.util.Scanner;
public class FibonacciSeries
{
    public static void displayfib(int term)
    {
        int t1 = 0;
        int t2 = 1;
        int n;
        int i = 1;
        while(i<=term)
        {
            System.out.println(t1+"\t");
            n = t1+t2;
            t1 = t2;
            t2 = n;
            i++;
        }
    }
    public static void main(String[] args)
    {
        int terms;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        terms = sc.nextInt();
        System.out.println("The Fibonacci Series is ");
        displayfib(terms);
        sc.close();
    }
}
