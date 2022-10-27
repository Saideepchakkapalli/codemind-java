import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if(a<x || b<x)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(a==b)
            {
                System.out.println("ACCEPTED");
            }
            else if(a==x && b==x)
            {
                System.out.println("ACCEPTED");
            }
              else if(a>x || b>x)
            {
                System.out.println("CROP IT");
            }
        }
    }
}