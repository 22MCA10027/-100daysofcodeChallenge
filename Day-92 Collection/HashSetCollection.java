import java.util.*;
class HashSetCollection
 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        HashSet<String> hset=new HashSet<String>();
        System.out.println("");
        int choice;
        do
        {
            System.out.println("1.Add 2.Remove 3.Size 4.Display 5.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice)
            {
            case 1:
              System.out.println("Enter string to be inserted");
              String data=sc.next();
              hset.add(data);
              break;
            case 2:
              if(hset.isEmpty()){
                System.out.println("HastSet is Empty");
              }
              else
              {
              System.out.println("Enter string to be Deleted");
              String delEle=sc.next();
              if(hset.contains(delEle))
              {
                hset.remove(delEle);
                System.out.println("Element removed Successfully");
              }
                else
              {
                System.out.println("Element not found to delete");
              }
              }
              break;
            case 3:
              if(hset.isEmpty())
              {
                System.out.println("HashSet is Empty");
              }
                else
              {
                System.out.println("The size of set is "+hset.size());
              }
              break;
            case 4:
              if(hset.isEmpty())
              {
                System.out.println("HashSet is Empty");
               }
                else
                {
                Iterator<String> itr=hset.iterator();  
                while(itr.hasNext())
                {  
                    System.out.print(itr.next()+"   ");  
                }  
                }
                System.out.println();
                break;
            case 5:
               System.out.println("Exit.....");
               System.exit(0);
               break;
            default:
               System.out.println("Invalid choice"); 
            }     
        }
      while(choice!=5);
    }
}
