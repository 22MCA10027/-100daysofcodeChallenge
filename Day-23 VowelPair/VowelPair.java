import java.util.*;
class VowelPair {
    static boolean isVowel(char ch)
    {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            return true;
            default:
            return false;
        }
    }
    static int vowelPairs(String s, int n)
    {
        int count = 0;
        for (int i=0;i<n-1;i++) {
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(i+1)))
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the line");
        String str = sc.nextLine();
        int n = str.length();
        System.out.println(vowelPairs(str, n));
    }
}
