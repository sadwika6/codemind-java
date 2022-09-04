import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        float a,b,c;
        Scanner i=new Scanner(System.in);
        a=i.nextFloat();
        b=i.nextFloat();
        c=a*b;
        System.out.printf("%.2f",c);
    }
}