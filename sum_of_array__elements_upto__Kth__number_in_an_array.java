import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n,s=0,k;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=c.nextInt();
        }
        k=c.nextInt();
        for(int i=0;i<k;i++)
        {
            s+=arr[i];
        }
        System.out.print(s);
    }
}