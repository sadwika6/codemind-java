import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a,n,p;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        n=c.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                p=a*i;
                System.out.printf("%d x %d = %d
",a,i,p);
            }
        }
    }
}