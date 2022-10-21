import java.util.Scanner;
class Linear
{
    boolean linears(int a[],int key)
    {
        int i=1;
        int k=key;
        int n=a.length;
        while(i<n&&a[i]!=k)
        {
            i++;
        }
        if(i<n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array");
        int n=sc.nextInt();
        int a[]= new int[n+1];
        System.out.println("Enter the elements");
        for(int i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Key Element to Search");
        int key=sc.nextInt();
        Linear search= new Linear();
         System.out.println(search.linears(a,key));
    }
}
