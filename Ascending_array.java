import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,f=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=c.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                f+=1;
            }
        }
        if(f==n-1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}