import java.util.*;
class anagram
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a1=s.nextLine();
        String a2=s.nextLine();
        int l1=a1.length();
        int l2=a2.length();
        int c=0;
        if(l1==l2)
        {
            for(int i=0;i<l1;i++)
            {
                    if(a1.contains(Character.toString(a2.charAt(i))))
                    {
                        c++;
                    }
            }
            if(c==l1)
            {
                System.out.print("true");
            }
            else
            {
                System.out.print("false");
            }
        }
        else
        {
            System.out.print("false");
        }
    }
}