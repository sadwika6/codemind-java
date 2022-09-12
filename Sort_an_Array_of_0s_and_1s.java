import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,j=0;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        int arr[]=new int[n];
        int l[]=new int[n];
        for(int z=0;z<n;z++)
        {
            arr[z]=x.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                l[j++]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                l[j++]=arr[i];
            }
        }
        for(int z=0;z<n;z++)
        {
            System.out.printf("%d ",l[z]);
        }
    }
}