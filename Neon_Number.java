import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int sq=n*n;
        int s=0,i;
        while(sq!=0)
        {
            i=sq%10;
            sq=sq/10;
            s+=i;
        }
        if(s==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
        
    }
}