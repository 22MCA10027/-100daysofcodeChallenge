import java.util.Scanner;
class Revtext
{
    public static void main(String[] args)
    {
        System.out.println("Enter a line");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            str1 = ch + str1;
        }
        System.out.println("Reversed Line is:" +str1);
    }
}
