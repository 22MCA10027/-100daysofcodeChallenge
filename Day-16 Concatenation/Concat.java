class Concat
{
    public static void main(String[] args)
    {
        String str1 = "Hari";  //declaring string 1 by using literals
        String str2 = "Krishna";  //declaring string 2 by using literals
        String str3 = str1.concat(str2);  //combining above two strings by passing one string as an arguement
        System.out.println(str3);  //printing and displaying combined strings
        String str4 = "SINGANAMALA";
        String str5 = str3.concat(str4);
        System.out.println(str5);
    }
}
