import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,m=1;
        int i;
        while(n!=0)
        {
            i=n%10;
            n=n/10;
            s=s+i;
            m=m*i;
        }
        if(s==m)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}