import java.util.Scanner;
class Solution{
    public static void main(String args[])
    {
        int r;
        Scanner s=new Scanner(System.in);
        r=s.nextInt();
        double a=(3.14)*r*r;
        System.out.format("%.2f",a);
    }
}