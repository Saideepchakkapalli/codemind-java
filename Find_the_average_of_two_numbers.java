import java.util.Scanner;
class Solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float a=s.nextInt();
        float b=s.nextInt();
        float avg=(a+b)/2;
        System.out.format("%.4f",avg);
    }
}