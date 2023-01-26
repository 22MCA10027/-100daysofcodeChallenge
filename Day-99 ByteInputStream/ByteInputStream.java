import java.io.*;
import java.util.Scanner;
class ByteInputStream
{
public static void main(String args[]) throws IOException
{
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter some string");
   String tmp=sc.next();
   System.out.println("Converting input string into byte array by using getBytes()");
   byte b[] = tmp.getBytes();
   ByteArrayInputStream in = new ByteArrayInputStream(b);
   for (int i=0; i<2; i++) 
   {
     int c;
     while ((c = in.read()) != -1) 
     {
        if (i == 0) 
        {
           System.out.print((char) c);
        } 
        else 
        {
           System.out.print(Character.toUpperCase((char) c));
        }
      }
      System.out.println();
      in.reset();
    }
  }
}
