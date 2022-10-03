import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,f=0,a,b;
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
                System.out.print(arr[i]+" ");
            }
        }
        if(f==0)
        {
            System.out.print("-1");
        }
    }
}