import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] number=new int[n];
        int s=0;
        for(i=0;i<n;i++)
        {
            number[i]=sc.nextInt();
            s+=number[i];
        }
        System.out.println(s);
    }
    
}