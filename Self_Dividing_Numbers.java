
import java.util.Scanner;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            int j,temp=i,c=0,s=0;
            while(temp!=0)
            {
                j=temp%10;
                temp=temp/10;
                c++;
                if(j==0)
                {
                    break;
                }
                else
                {
                    if(i%j==0)
                    {
                        s++;
                    }
                }
            }
            if(c==s)
            {
                System.out.format("%d ",i);
            }
        }
    }
}
