import java.util.*;
class Solution 
{
    public static int eve(int n)
    {
        int c=0;
        while(n!=0)
        {
            int i=n%10;
            n=n/10;
            c++;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(eve(a[i])%2==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}