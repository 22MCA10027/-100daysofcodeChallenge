import java.util.Scanner;

public class AlphabetASCIIValue 
{

   public static void main(String[] args) {

      
      char ch ;
    
      int value ;

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter an alphabet:: ");
      ch = sc.next().charAt(0);

      value = ch;

      System.out.println("ASCII value of "+ ch+" = "+value);

      System.out.println("ASCII value of "+ ch+" = "+ (int)ch );

      sc.close();
     }
 }
