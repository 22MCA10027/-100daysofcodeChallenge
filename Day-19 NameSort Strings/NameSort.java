import java.io.*;
class NameSort
{
    public static void main(String args[])
    {
        int n = 6;
        String names[] = {"HariKrishna","Balaji","SaiPawan","Saikishore","VenkataNagaPawan","Aadarsh"};
        String temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
              if(names[i].compareTo(names[j])>0)
              {
                temp=names[i];
                names[i]=names[j];
                names[j]=temp;
              }
              }
            }
            System.out.println("The names in Alphabetical  order are:");
            for(int i=0;i<n;i++)
            {
                System.out.println(names[i]);
            }
        }
    }
