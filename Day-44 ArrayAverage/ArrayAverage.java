import java.util.Scanner;
public class ArrayAverage {
    public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
     int n = sc.nextInt();
    
     int array[] = new int[n];
     System.out.println("Enter the elements into the array");
     for (int i =0;i<n;i++)
     {
        array [i]  = sc.nextInt();
     }
     
      double sum = 0.0;
      for(int i=0;i<n;i++)
      {
        sum=sum+array[i];
      }
    
      double avg = 0.0;
  
      avg = sum/array.length;
  
      System.out.println("Average: " + avg );
    }
  }
