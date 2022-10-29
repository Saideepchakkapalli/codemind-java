import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,c=0,s=0,sum=0,rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        while(rev!=0)
        {
            if(rev%10==6 && c==0)
            {
                sum=(sum*10)+9;
                c++;
            }
            else
                sum=(sum*10)+(rev%10);
                rev=rev/10;
        }
        System.out.println(sum);
    }
}