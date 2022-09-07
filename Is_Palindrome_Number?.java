import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,t,r,s=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        t=n;
        while(n!=0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(s==t)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
    }
}