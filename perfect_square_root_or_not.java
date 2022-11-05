import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,f=0;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        for(int i=1;i<=(n/2);i++)
        {
            if(i*i==n)
            {
                f=1;
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