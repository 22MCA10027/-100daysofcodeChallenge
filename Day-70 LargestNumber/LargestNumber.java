import java.util.Scanner;

public class LargestNumber
 {

    public static void main(String[] args) 
    {

       double num1 = 0.0, num2 = 0.0, num3 = 0.0;
       double largestNumber = 0.0;

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter three numbers:: ");
       num1 = sc.nextDouble();
       num2 = sc.nextDouble();
       num3 = sc.nextDouble();

       if(num1 >= num2)
        {
            if(num1 >= num3) largestNumber = num1;
            else largestNumber = num3;
       } else {
            if(num2>=num3) largestNumber = num2;
            else largestNumber = num3;
       }

       System.out.println("Largest number among three numbers is "+ largestNumber);

       sc.close();

     }
 }
