import java.util.Scanner;
class ascii
{
    public static void main(String args[])
    {
        char c;
        int a;
        Scanner ch=new Scanner(System.in);
        c=ch.next().charAt(0);
        a=(int)c;
        System.out.printf("%d",a);
    }
}