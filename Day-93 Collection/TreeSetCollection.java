
import java.util.*;
class TreeSetCollection
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        NavigableSet<Integer> t=new TreeSet<>();
        int choice;
       do
       {
        System.out.println("1.Add 2.Remove 3.pollFirst 4.pollLast 5.Display 6.Exit");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
              System.out.println("Enter element ");
              int element=sc.nextInt();
              t.add(element);
              System.out.println("Element added successfully");
              break;
            case 2:
              if(t.isEmpty())
              {
              System.out.println("Tree is Empty...!");
              }
              else{
                System.out.println("Enter element ");
                int ele=sc.nextInt();
                if(t.contains(ele))
                {
                t.remove(ele);
                System.out.println("Element deleted from the Tree successfully");
                }else{
                    System.out.println("Element is not present in Tree. So deletion is not possible");
                }
              }
              break;
            case 3:
              if(t.isEmpty())
              {
                System.out.println("Tree is Empty to remove First element");
              }
              else{
              t.pollFirst();
              System.out.println("First element deleted from Tree is ");
              }
              break;
            case 4:
              if(t.isEmpty())
              {
              System.out.println("Tree is Empty to remove Last element");
              }
               else{
                t.pollLast();
                System.out.println("Last element deleted from Tree is ");
               }
              break;
            case 5:
              if(t.isEmpty())
              {
                System.out.println("Tree is Empty to remove Last element");
              }
             else{
                System.out.println("The elements are "+t);
               }
              break;
            case 6:
              System.out.println("Exit.....");
              System.exit(0);
              break;
            default:
              System.out.println("Invalid Choice");   
        }
       }
      while(choice!=6);
    }
}
