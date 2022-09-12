import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,j=0;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=x.nextInt();
        }
        int l[]=new int[n];
        for(int i=n-1;i>=n/2;i--)
        {
            l[j++]=arr[i];
        }
        for(int i=0;i<n/2;i++)
        {
            l[j++]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",l[i]);
        }
    }
}