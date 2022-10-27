import java.util.*;
class Solution 
{
    boolean prime(int n)
    {
        if(n==1)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Solution s=new Solution();
        for(int i=a;i<=b;i++)
        {
            if(s.prime(i))
            {
                System.out.println(i);
            }
        }
        
    }
}
