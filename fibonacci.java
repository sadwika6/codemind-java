import java.util.Scanner;
class fibonacci
{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.printf("%d %d ",n1,n2);
        for(i=3;i<=n;i++)
        {
            n3=n1+n2;
            System.out.printf("%d ",n3);
            n1=n2;
            n2=n3;
        }
    }
}