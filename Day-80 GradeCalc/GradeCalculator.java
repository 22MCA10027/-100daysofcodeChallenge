import java.util.Scanner;
public class GradeCalculator
 {
    public static void main(String[] args) 
    {
        System.out.println("Enter your Score");
        Scanner sc = new Scanner(System.in);
       int score = sc.nextInt();
       String grade = null; 
       switch(score/10) 
       {
         case 10:
         case 9:
            grade = "A";
            break;

         case 8:
            grade = "B";
            break;

         case 7:
            grade = "C";
            break;
       
         case 6:
            grade = "D";
            break;
  
         case 5:
            grade = "E";
            break;
   
         default:
            grade = "F";
            break;
       }
       System.out.println("Your Grade is = " + grade);
    }
 }
