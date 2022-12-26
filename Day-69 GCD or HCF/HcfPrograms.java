import java.util.Scanner;

public class HcfPrograms
 {

  public static int findHCF(int num1, int num2) 
  {
     while(num1 != num2)
      {
        if(num1 > num2) 
            num1 = num1 - num2;
        else
            num2 = num2 - num1;
     }
     return num1;
  }

  public static void main(String[] args)
   {

      int number1 = 0;
      int number2 = 0;
      int hcf = 0;

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter two integer numbers::");
      number1 = sc.nextInt();
      number2 = sc.nextInt();

      hcf = findHCF(number1, number2);

      System.out.println("HCF(" + number1 + "," + number2 + ") = " + hcf );

      sc.close();
  }
} 
