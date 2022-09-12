import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a,b,co=0,f;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        b=c.nextInt();
        for(int i=a;i<=b;i++)
        {
            f=0;
            if(i==1)
            {
                continue;
            }
            else
            {
                for(int j=2;j<=Math.sqrt(i);j++)
                {
                    if(i%j==0)
                    {
                        f+=1;
                    }
                }
            }
            if(f==0)
            {
                co+=1;
            }
        }
        System.out.println(co);
    }
}