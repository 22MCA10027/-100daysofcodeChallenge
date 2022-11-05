import java.util.Scanner;
public class LengthofanArray
{
    public static void main(String args[])
    {
        int a[]=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the elements into the array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The elements of Aarray are ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("The Length of the Array is "+ a.length);
    }
}
