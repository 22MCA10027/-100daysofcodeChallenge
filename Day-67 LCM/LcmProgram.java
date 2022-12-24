import java.util.Scanner;

public class LcmProgram
 {

  public static long findLCM(int n1, int n2)
   {

     long minMultiple = 0;

     int smallest = (n1<n2) ? n1 : n2;
     int largest = (n1>n2) ? n1 : n2;

     minMultiple = smallest;

     while(true) {
        if(minMultiple % largest == 0)
            return minMultiple;
        minMultiple = minMultiple + smallest ;
     }
  }

  public static void main(String[] args) 
  {
     int number1 = 0;
     int number2 = 0;
     long lcm = 0;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter two integer numbers::");
     number1 = sc.nextInt();
     number2 = sc.nextInt();
     lcm = findLCM(number1, number2);
     System.out.println("LCM(" + number1 + "," + number2 + ") = " + lcm );
     sc.close();
  }
}
