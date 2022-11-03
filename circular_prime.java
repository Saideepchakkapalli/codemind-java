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
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        Solution s=new Solution();
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(s.prime(temp)&& s.prime(rev))
        {
            System.out.println("circular prime");
        }
        else if(s.prime(temp))
        {
            System.out.println("prime but not a circular prime");
        }
        else 
        {   
            System.out.println("not prime");
        }
        
        
    }
}