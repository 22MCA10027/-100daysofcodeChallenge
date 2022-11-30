import java.util.Scanner;
public class Point
{
    int x1, x2, y1, y2;
    void setdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x1 point");
        x1 = sc.nextInt();
        System.out.println("Enter the x2 point");
        x2 = sc.nextInt();
        System.out.println("Enter the y1 point");
        y1 = sc.nextInt();
        System.out.println("Enter the y2 point");
        y2 = sc.nextInt();
    }
    void calculate()
    {
        System.out.println(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
    }
    public static void main(String[] args)
    {
        Point a[] = new Point[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coordinates");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i] = new Point();
            a[i].setdata();
            a[i].calculate();
        }
    }
}
