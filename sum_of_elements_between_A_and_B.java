import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,a,b,sum=0,f=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=c.nextInt();
        }
        a=c.nextInt();
        b=c.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                f=1;
                sum+=arr[i];
            }
        }
        if(f==0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(sum);
        }
    }
}