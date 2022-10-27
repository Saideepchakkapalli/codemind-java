import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int j=0;j<x;j++)
        {
            int c=0;
            int n=sc.nextInt();
            for(int i=0;i*i<=n;i++)
            {
                if(i*i==n)
                {
                  c=1;   
                }
            }
            if(c==1)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}