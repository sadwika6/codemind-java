import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int t;
        Scanner x=new Scanner(System.in);
        t=x.nextInt();
        for(int z=0;z<t;z++)
        {
            int n,s,c=0;
            n=x.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=x.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i!=j)
                    {
                        s=a[i]+a[j];
                        for(int k=0;k<n;k++)
                        {
                            if(a[k]==s)
                            {
                                c+=1;
                            }
                        }
                    }
                }
            }
            if(c>0)
            {
                System.out.println(c/2);
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}