import java.util.*;
public class TwoSum
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter array size:");
	    int n=sc.nextInt();
	    System.out.print("Enter array elements:");
	    int[] a=new int[n];
	    int t;
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    System.out.print("Enter a target:");
	    t=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(a[i]+a[j]==t)
	            {
	                System.out.printf("%d %d",i,j);
	                System.out.println();
	            }
	        }
	    }
	}
}
