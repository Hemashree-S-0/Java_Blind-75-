import java.util.*;
class palindrome
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String r = "";
        for(int i=a.length()-1;i>=0;i--)
        {
            r+=a.charAt(i);
        }
        if(a.equals(r))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}