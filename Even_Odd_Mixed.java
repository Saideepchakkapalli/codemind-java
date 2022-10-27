import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int c=0,s=0;
        while(n!=0)
        {
            i=n%10;
            n=n/10;
            if(i%2==0)
            {
                c++;
            }
            else
            {
                s++;
            }
        }
        if(c>0 && s>0)
        {
            System.out.println("Mixed");
        }
        else if(c>0 && s==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}