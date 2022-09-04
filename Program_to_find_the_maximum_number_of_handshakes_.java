import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a,b;
        Scanner i=new Scanner(System.in);
        a=i.nextInt();
        a-=1;
        b=(int)(a*(a+1)/2);
        System.out.printf("%d",b);
    }
}