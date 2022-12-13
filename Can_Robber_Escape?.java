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
            if(arr[i]%2!=0)
            {
                ct+=1;
            }
        }
        if(ct<=2)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}