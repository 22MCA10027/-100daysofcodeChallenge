import java.util.Scanner;
public class ArrayDelete
{
 public static void main(String args[])
 {
  int n,m;
  Scanner sc=new Scanner(System.in);
  System.out.println("Please enter the size of an Array");  
  n=sc.nextInt();
  int a[]=new int[n];  
  int b[]=new int[n-1];
  System.out.println("Enter the the elements into the Array");
  for(int i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
  }
  System.out.println("Enter the Index value where you wants to delete the element");
  m=sc.nextInt();
  for(int i=0;i<a.length;i++)
  {
    if(i<m)
    {
       b[i]=a[i]; 
    }
    else if(i==m)
    {
       continue;
    }
    else
    {
        b[i-1]=a[i];
    }
  }
  System.out.println("After the deletion the elements are");
  for(int i=0;i<n-1;i++)
  {
    System.out.println(b[i]);
  }
 }   
}
