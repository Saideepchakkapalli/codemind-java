import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,nrev=0;
        if(n>0)
        {
            while(n>0)
            {
                rev=rev*10+n%10;
                n=n/10;
            }
            System.out.println(rev);
        }
        else
        {
            n=n*-1;
            while(n>0)
            {
                nrev=nrev*10+n%10;
                n=n/10;
            }
            System.out.println("-"+nrev);
        }
        
    }
}
