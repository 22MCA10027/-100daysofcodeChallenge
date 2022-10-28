import java.util.Scanner;
class Convert
{
    public static void main(String[] args)
    {
        char ch,ch2;
        System.out.println("ENter any charecter");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
        {
            ch2 = Character.toLowerCase(ch);
            System.out.println("Lowercase:" +ch2);
        }
        else
        {
            ch2 = Character.toUpperCase(ch);
            System.out.println("Uppercase:" +ch2);
        }
    }
}
