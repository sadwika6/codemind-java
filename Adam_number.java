import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a,s=0,n,x,y=0,r,t,z;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        n=a;
        while(n!=0)
        {
            r=n%10;
            s=(s*10)+r;
            n/=10;
        }
        x=s*s;
        z=a*a;
        t=x;
        while(t!=0)
        {
            r=t%10;
            y=(y*10)+r;
            t=t/10;
        }
        if(z==y)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}