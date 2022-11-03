import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int max;
        if(a>b)
        {
            max=a;
        }
        else
        {
            max=b;
        }
        while(true)
        {
            if(max%a==0 && max%b==0)
            {
                System.out.println(max);
                break;
            }
            max+=1;
        }
        
    }
}