import java.util.*;
class ContainsDuplicate
{
    public static boolean duplicate(int arr[],int n)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
        }
        if(c>0)
        {
            return true;
        }
        return false;
    }
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
		System.out.print(duplicate(arr,n));
	}
}
