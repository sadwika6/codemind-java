import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int t;
        Scanner c=new Scanner(System.in);
        t=c.nextInt();
        for(int i=0;i<t;i++)
        {
            int a,b,m=0;
            a=c.nextInt();
            b=c.nextInt();
            for(int j=a;j<=b;j++)
            {
                if(j%10==2 || j%10==3 || j%10==9)
                {
                    m+=1;
                }
            }
            System.out.println(m);
        }
    }
}