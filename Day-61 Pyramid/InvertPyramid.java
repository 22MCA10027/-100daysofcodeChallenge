public class InvertPyramid
 {
    public static void main(String[] args)
     {
       for (int i=9; i >= 1; i--) 
       {
          for(int j=i; j >= 1; j--)
           {
    
             System.out.print("* ");
          }

          System.out.println();
       }
    }
 }
