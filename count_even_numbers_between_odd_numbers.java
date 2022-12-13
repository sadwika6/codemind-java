import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n,ct=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=c.nextInt();
        }
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]%2==0)
            {
                if(arr[i-1]%2!=0 && arr[i+1]%2!=0)
                {
                    ct+=1;
                }
            }
        }
        System.out.print(ct);
    }
}