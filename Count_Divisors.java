import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int count=0;
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}