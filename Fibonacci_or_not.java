import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,f=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int n1=1,n2=1,n3=0;
        while(n>1)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            if(n==n2)
            {
                f=1;
                break;
            }
            else if(n>n1 && n<n2)
            {
                f=0;
                break;
            }
        }
        if(f==0)
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
    }
}