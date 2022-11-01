import java.util.Scanner;
public class StringOccurence {
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Line ");
String str=sc.nextLine();
String s[]=str.split(" ");
int count=0;
for(String i:s)
{
if(i.equals("the"))
{
count++;
}
}
System.out.println("The occurrences of the are "+count);
}
}
