import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a,s=0,i=0,n,r,t;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        n=a;
        t=a;
        while(t!=0)
        {
            i++;
            t/=10;
        }
        while(n!=0)
        {
            r=n%10;
            s+=Math.pow(r,i);
            i--;
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