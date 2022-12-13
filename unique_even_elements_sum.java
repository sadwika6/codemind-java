import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n,s=0,k=0,ct;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=c.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                k=arr[i];
                ct=0;
                for(int j=0;j<n;j++)
                {
                    if(arr[j]==k)
                    {
                        ct+=1;
                    }
                }
                if(ct==1)
                {
                    s+=arr[i];
                }
                else
                {
                    s+=(arr[i])/ct;
                }
            }
        }
        System.out.print(s);
    }
}