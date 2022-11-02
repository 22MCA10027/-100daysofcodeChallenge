import java.util.Scanner;
class ArrayInsert
{
 public static void main(String args[])
 {
  int n,m,p;
  Scanner sc=new Scanner(System.in);
  System.out.println("Please enter the Size of an Array");  
  n=sc.nextInt();
  int a[]=new int[n];  
  int b[]=new int[n+1];
  System.out.println("Enter the desired elements into the Array");
  for(int i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
  }
  System.out.println("Please enter the index value to insert an element into the Array");
  m=sc.nextInt();
  System.out.println("Enter a new value to insert into the array");
  p=sc.nextInt();
  for(int i=0;i<n+1;i++)
  {
    if(i<m)
    {
       b[i]=a[i]; 
    }
    else if(i==m)
    {
        b[i]=p;
    }
    else
    {
        b[i]=a[i-1];
    }
  }
  System.out.println("After insertion the elements are: ");
  for(int i=0;i<n+1;i++)
  {
    System.out.println(b[i]);
  }
 }   
}
