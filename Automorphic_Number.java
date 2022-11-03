import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int i=0,c=0,t,x,y=0,p,r=0,k;
        while(temp>0)
        {
            i=temp%10;
            temp=temp/10;
            c+=1;
        }
        int s=n*n;   
        k=s;
          while(c!=0)
        {
            x=s%10;
            s=s/10;
            y=y*10+x;
            c--;
        }
          while(y!=0)
        {
            p=y%10;
            y=y/10;
            r=r*10+p;
        }
        if(r==n)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
        
        
    }
}