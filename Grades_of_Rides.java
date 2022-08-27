import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int hf=s.nextInt();
        int sf=s.nextInt();
        int spf=s.nextInt();
        if(hf>50 && sf>60 && spf>100)
        {
            System.out.println("10");
        }
        else if(hf>50 && sf>60 && spf<=100)
        {
            System.out.println("9");
        }
        else if(hf<=50 && sf>60 && spf>100)
        {
            System.out.println("8");
        }
        else if(hf>50 && sf<=60 && spf>100)
        {
            System.out.println("7");
        }
        else if(hf>50 || sf>60 || spf>100)
        {
            System.out.println("6");
        }
        else if(hf<=50 && sf<=60 && spf<=100)
        {
            System.out.println("5");
        }
    }
}