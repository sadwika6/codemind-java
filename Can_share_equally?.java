import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a,b;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        b=c.nextInt();
        if(a==0 && b%2==0)
        {
            System.out.printf("YES");
        }
        else if(a==0 && b%2!=0)
        {
            System.out.printf("NO");
        }
        else if((a+(2*b))%2==0)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}