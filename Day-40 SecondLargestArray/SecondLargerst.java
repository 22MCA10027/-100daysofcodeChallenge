import java.util.Scanner;
public class SecondLargest
 {

  public static int secondLargest(int[] arr)
   {
    
    int fmax = 0; 
    int smax = 0; 

    fmax = arr[0];
    smax = arr[0];

    for (int i = 1; i < arr.length; i++) 
    {
      if (fmax < arr[i]) {
        smax = fmax;
        fmax = arr[i];
      } 
      else if(smax < arr[i]) {
        smax = arr[i];
      }
    }

    return smax;
  }
  
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    int length = 0;
    int numbers[] = null;

    System.out.print("Enter length of the array: ");
    length = scan.nextInt();

    numbers = new int[length];

    System.out.println("Enter the elements into the array: ");
    for (int i = 0; i < numbers.length; i++) 
    {
      numbers[i] = scan.nextInt();
    }

    System.out.println("Second largest element = "  + secondLargest(numbers));
    scan.close();
  }
}
