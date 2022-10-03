import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,f=0,a,b,k,y;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=c.nextInt();
        }
        a=c.nextInt();
        b=c.nextInt();
        k=1000;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                if(arr[i]<k)
                {
                    k=arr[i];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                if(arr[i]>k)
                {
                    f=1;
                    k=arr[i];
                }
            }
        }
        if(f==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(k);
        }
    }
}