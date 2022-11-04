import java.util.Scanner;
class AscendingArray
{
    public static void main(String[] args)
    {
        int a[]=new int[5]; 
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the elements into the Array");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("After arranging the elements in the array into Ascending Order is ");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
