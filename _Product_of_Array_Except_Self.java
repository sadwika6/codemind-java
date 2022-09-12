import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,m=1;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int arr[]=new int[n];
        int l[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=c.nextInt();
            m*=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            l[i]=(m/arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",l[i]);
        }
    }
}