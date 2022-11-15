import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix 
{
  // main method
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row size");
    int row= sc.nextInt();
    System.out.println("Enter column size");
    int column= sc.nextInt();

    int a[][] = new int [row][column];
    System.out.println("Enter the elements into the array");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<column;j++)
        {
            a[i][j] = sc.nextInt();
        }
    }
    int transpose[][] = new int[row][column];

    transpose = transposeMatrix(a,row,column);
   
    System.out.println("A = " + Arrays.deepToString(a));
    System.out.println("Transpose = " +  Arrays.deepToString(transpose));
  }
  public static int [][] transposeMatrix(int[][] a,int row,int column)
   {
    int temp[][] = new int[row][column];

    for (int i = 0; i < row; i++) {
    
      for (int j = 0; j < column; j++) {

        temp[i][j] = a[j][i];
      }
    }
 return temp;
  }

}
