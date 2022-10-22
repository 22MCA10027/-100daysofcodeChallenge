import java.util.Scanner;
class Binary
{
    int bin(int a[], int target)
    {
        int low=0;
        int high = a.length-1;
        int mid;
        while(low<=high)
        {
          mid=(low+high)/2;
          if(a[mid]==target)
          {
            return mid;
          }
          else if(a[mid]<target)
          {
            low = mid+1;
          }
          else
          {
            high = mid-1;
          }
        }
        return 0;
    }
}
class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter the Size of  an Array");
            int n = sc.nextInt();
            int a[] = new int[n+1];
            System.out.println("Enter the Elements");
            for(int i=1;i<=n;i++)
            {
                a[i]=sc.nextInt();
            }
         Binary obj = new Binary();
         System.out.println("please enter the target to find");
           int target = sc.nextInt();
           System.out.println(obj.bin(a,target));
        }
    }
}
