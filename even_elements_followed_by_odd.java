import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n;
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
                System.out.printf(arr[i]+" ");
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.printf(arr[i]+" ");
            }
        }
    }
}