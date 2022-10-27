import java.util.*;
class Solution 
{
    static int adddig(int n)
    {
        int i=0,s=0,c=0;
        while(n>0)
        {
         i=n%10;
         n=n/10;
         s+=i;
         c++;
        }
        if(c==1)
        {
            return s;
        }
        else
        {
            return adddig(s);
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(adddig(n));
    }
}