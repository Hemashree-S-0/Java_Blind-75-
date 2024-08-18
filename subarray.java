import java.util.*;
class subarray
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int max = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int p=1;
                for(int k=i;k<=j;k++)
                {
                    p*=arr[k];
                }
                if(p>max)
                {
                    max=p;
                }
                
            }
        }
        System.out.print(max);
    }
}