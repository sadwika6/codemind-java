import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n,k,count=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=c.nextInt();
        }
        k=0;
        for(int i=0;i<n;i++)
        {
            count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]==arr[i])
                {
                    count+=1;
                }
            }
            if(count==1)
            {
                if(arr[i]%2!=0)
                {
                    k+=arr[i];
                }
            }
        }
        System.out.print(k);
    }
}