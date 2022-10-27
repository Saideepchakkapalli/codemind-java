import java.util.*;
class Solution 
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int j=0;j<x;j++)
        {
            int n;
            n=sc.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
        }
    }
}