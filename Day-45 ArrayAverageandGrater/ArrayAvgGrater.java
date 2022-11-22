import java.util.Scanner;

public class ArrayAvgGrater
 {

  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of the array: ");
    int n = sc.nextInt();

    int numbers[] = new int[n];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < n; ++i)
    {
      numbers[i] = sc.nextInt();
    }

    double avg = average(numbers);
    
    System.out.println("Average pf an Array is = " + avg);
    
       System.out.println("Numbers that are greater then average is = ");
    display(numbers, avg);

    sc.close();
  }

  public static void display(int[] numbers, double avg)
   {

    for (int i : numbers) 
    {
      if(i > avg)
      System.out.print(i+" ");
    }
    
  }

  public static double average(int[] numbers) 
  {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i]; 
    }

    return sum/numbers.length;
  }
}
