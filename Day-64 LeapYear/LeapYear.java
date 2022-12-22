import java.util.Scanner;

public class LeapYear
 {

    public static void main(String[] args) 
    {

       int year = 0;
       boolean result = false;

       Scanner sc= new Scanner(System.in);

       System.out.print("Enter year:: ");
       year = sc.nextInt();

       if(( year%4==0) && ( (year%400==0) || (year%100!=0) ) )
            result = true;
       else
            result = false;

       if(result == true) 
           System.out.println(year+" is a leap year");
       else System.out.println(year+" is not a leap year");

       sc.close();

    }
 }
