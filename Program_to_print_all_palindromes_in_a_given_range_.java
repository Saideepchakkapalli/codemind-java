import java.util.*;
class Solution 
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<b+1;i++)
        {
           int temp=i,rev=0;
           while(temp!=0)
           {
               rev=rev*10+temp%10;
               temp/=10;
           }
           if(rev==i)
           {
               System.out.format("%d ",i);
           }
        }
    }
}