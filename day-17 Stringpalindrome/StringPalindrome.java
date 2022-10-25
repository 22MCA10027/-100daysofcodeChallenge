class StringPalindrome
{
    public static void main(String[] args)
    {
      String str = "HariKrishna";
      String rev = "";
      for(int i =str.length()-1;i>=0;i--)
      {
        rev = rev+str.charAt(i);
      }
      if (str.equals(rev))
      {
        System.out.println("Given String is a palindrome");
      }
      else 
      {
        System.out.println("Given Strinng is not a palindrome");
      }
    }
}
