import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,temp=n,fact,j,s=0,f;
        while(n>0)
        {
            i=1;
            f=1;
            j=n%10;
            while(i<=j)
            {
                f=f*i;
                i+=1;
            }
            s=s+f;
            n=n/10;
        }
     if(s==temp)
    {
        System.out.println("The number "+temp+" is a strong number");
    }
    else
    {
            System.out.println("The number "+temp+" is not a strong number");
    }
    }
  
}
