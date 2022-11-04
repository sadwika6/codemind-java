import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int s,n,r;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        s=0;
        while(n!=0)
        {
            r=n%10;
            s=(s*10)+r;
            n/=10;
        }
        System.out.print(s);
    }
}