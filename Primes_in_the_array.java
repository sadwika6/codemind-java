import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,f=0,ct=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int l[]=new int[n];
        for(int i=0;i<n;i++)
        {
            l[i]=c.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            f=0;
            for(int j=2;j<=Math.sqrt(l[i]);j++)
            {
                if(l[i]%j==0)
                {
                    f+=1;
                }
            }
            if(f==0 && l[i]>1)
            {
                ct+=1;
            }
        }
        System.out.print(ct);
    }
}