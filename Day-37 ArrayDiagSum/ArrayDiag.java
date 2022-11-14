import java.util.Scanner;
public class ArrayDiag
 {

    public static void main(String[] args)
     {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter row size ");
      int m=sc.nextInt();
      System.out.println("Enter column size ");
      int n=sc.nextInt();
      int a[][]=new int[m][n];
      System.out.println("Enter the elements into an array ");
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
      }
     int sum = diagonalSum(a);
      
      // display result
      System.out.println("Sum of diagonal elements = " + sum);
    }
  
    // method to find sum of diagonal elements of matrix
    public static int diagonalSum(int a[][]) 
     {
      int sum = 0;
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
          if(i == j) sum += a[i][j];
        }
      }
      return sum;
    }
  }
