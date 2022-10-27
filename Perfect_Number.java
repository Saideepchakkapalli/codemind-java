
import java.util.*;
class Solution 
{
    static int divsum(int n)
    {
        int i;
        int s=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if(s==divsum(s))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        
    }
}
