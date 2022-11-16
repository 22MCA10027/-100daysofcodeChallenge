import java.util.Scanner;

public class LargestArray {

  public static int largest(int[] array) {
    
    int max = array[0];

    for (int i = 1; i < array.length; i++) {
      if (max < array[i])
        max = array[i];
    }

    return max;
  }
  
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int size = 0;
    int arr[] = null;

    System.out.print("Enter length of the array: ");
    size = scan.nextInt();

    arr = new int[size];

    System.out.println("Enter array elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scan.nextInt();
    }
    
    System.out.println("Largest element = " + largest(arr));
    
    scan.close();
  }
}
