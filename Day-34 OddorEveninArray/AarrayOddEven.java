import java.util.Scanner;

public class ArrayOddEven
 {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
  System.out.print("Enter the size of an array");
    int n = sc.nextInt();
    int numbers[] = new int[n];
System.out.println("Enter the elements into the array");
    for (int i = 0; i < n; ++i) {
      numbers[i] = sc.nextInt();
    }
  countOddEven(numbers);
 sc.close();
  }

  public static void countOddEven(int[] arr) {

    int oddCount = 0;
    int evenCount = 0;

     for (int i = 0; i < arr.length; ++i) {
      if (arr[i] % 2 == 0) // even
        ++evenCount;
      else                 // odd
        ++oddCount;
    }

   
    System.out.println("Count of the Even numbers = "  + evenCount);
    System.out.println("Count of the Odd numbers = "  + oddCount);

  }

}
