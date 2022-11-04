import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,r,m=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        while(n!=0)
        {
            r=n%10;
            if(r>m)
            {
                m=r;
            }
            n/=10;
        }
        System.out.print(m);
    }
}