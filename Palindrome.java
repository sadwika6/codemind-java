import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a,s,n,r;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        s=0;
        n=a;
        while(n!=0)
        {
            r=n%10;
            s=(s*10)+r;
            n/=10;
        }
        if(s==a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}