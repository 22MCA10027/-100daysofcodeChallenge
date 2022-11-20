import java.util.Scanner;

public class ArrayCount
 {
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of an Array ");
    int n = sc.nextInt();

    int numbers[] = new int[n];

    System.out.println("Enter the elements into the array ");
    for (int i = 0; i < n; ++i) {
      numbers[i] = scan.nextInt();
    }

    checkNumbers(numbers);

    sc.close();

  }

  public static void checkNumbers(int[] numbers)
   {
    int positive = 0;
    int negative = 0;
    int zero = 0;

    for (int num : numbers) 
    {
      if (num > 0) 
      {       
        ++positive;
      } 
      else if (num < 0) 
      { 
        ++negative;
      }
       else 
       {              
        ++zero;
      }
    }

    System.out.println("Positive numbers = " + positive);
    System.out.println("Negative numbers = " + negative);
    System.out.println("Zeros = " + zero);
  }
}
