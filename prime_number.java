import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,f=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                f+=1;
            }
        }
        if(f==2)
        {
            System.out.print("prime");
        }
        else
        {
            System.out.print("not a prime");
        }
    }
}