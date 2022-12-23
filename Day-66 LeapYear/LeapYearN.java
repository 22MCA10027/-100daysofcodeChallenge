import java.util.Scanner;

public class LeapYearN 
{

    public static boolean isLeapYear(int year)
     {
       if(year % 4 == 0) 
       {
           if(year % 100 == 0) 
           {
               if(year % 400 == 0) return true;
               else return false;
           } else return true;
       } else return false;
    }

    public static void main(String[] args)
     {

       int year = 0;
       boolean result = false;

       Scanner scan = new Scanner(System.in);

       System.out.print("Enter year:: ");
       year = scan.nextInt();

       result = isLeapYear(year);

       if(result) 
           System.out.println(year+" is a leap year");
       else System.out.println(year+" is not a leap year");

       scan.close();

     }
 }
