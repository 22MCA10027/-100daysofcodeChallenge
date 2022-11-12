import java.util.Arrays;

public class ArrayDuplicate
{
   public static void main(String[] args) 
   {
      int arr[] = {10, 10, 20, 20, 30, 30, 40, 40, 50, 50, 60, 60, 60};
      
      int newArr[] = removeDuplicates(arr);
      
      System.out.println("Original array: "+ Arrays.toString(arr));
      System.out.println("After removing duplicates: " + Arrays.toString(newArr));
        }
   public static int[] removeDuplicates(int[] arr)
   {
        int j = 0; // index without duplicates
      int lastIndex = arr.length-1; 
         for (int i = 0; i < lastIndex; i++)
         {
         if(arr[i] != arr[i+1]) 
         {
            arr[j++] = arr[i];
         }
      }
      if(arr[j] != arr[lastIndex])
         arr[j++] = arr[lastIndex];
      return Arrays.copyOf(arr, j);
   }
}
