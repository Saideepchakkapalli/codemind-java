import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
           int m=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
     
        int[] b=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.printf("%d ",a[i]);
            }
        }
        int f=0;
        for(int i=0;i<m;i++)
        {
            f=0;
            for(int j=0;j<n;j++)
            {
                if(b[i]==a[j])
                {
                    f=1;
                }
            }
            if(f==0)
            {
                System.out.printf("%d ",b[i]);
            }
        }
        
    }
}