import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        char n;
        n=scan.next().charAt(0);
        if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u' || n=='A' || n=='O' || n=='E' || n=='I' || n=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}