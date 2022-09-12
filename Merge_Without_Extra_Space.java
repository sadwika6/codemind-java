import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int t;
        Scanner c=new Scanner(System.in);
        t=c.nextInt();
        for(int z=0;z<t;z++)
        {
            int n1,n2,k1=0,k2=0,k=0;
            n1=c.nextInt();
            n2=c.nextInt();
            int l[]=new int[n1+n2];
            for(int i=0;i<n1+n2;i++)
            {
                l[i]=c.nextInt();
            }
            Arrays.sort(l);
            for(int i=0;i<n1+n2;i++)
            {
                if(i!=(n1+n2-1))
                {
                    System.out.printf("%d ",l[i]);
                }
                else
                {
                    System.out.printf("%d",l[i]);
                }
            }
            System.out.printf("
");
        }
    }
}