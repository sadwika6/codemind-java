import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n,a,b,s=0;
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
            if(arr[i]<a || arr[i]>b)
            {
                s+=arr[i];
            }
        }
        System.out.print(s);
    }
}