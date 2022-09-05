import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a,b;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        b=c.nextInt();
        while(a!=b)
        {
            if(a>b)
            {
                a-=b;
            }
            else
            {
                b-=a;
            }
        }
        System.out.println(a);
    }
}