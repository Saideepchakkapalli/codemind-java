import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}