
import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,s=0,m=1;
        while(n!=0)
        {
            i=n%10;
            n=n/10;
            s=s+i;
            m=m*i;
        }
        System.out.println((m-s));
    }
}
