import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopying
 {

   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the size of an array:");
     
     int size = sc.nextInt();
     
      int arr[] = new int[size];

     System.out.println("Enter the elements into the array:");
     
     for(int i=0;i<size;i++)
     {
       arr[i] = sc.nextInt();
     }

      int newArr[] = new int[arr.length];

      for (int i = 0; i < arr.length; i++) {

         newArr[i] = arr[i];
      }

      System.out.println("The Original Array is = "  + Arrays.toString(arr));
     
      System.out.println("The Copied Array is = "    + Arrays.toString(newArr));
   }
}
