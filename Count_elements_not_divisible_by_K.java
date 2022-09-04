import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,k,s=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        k=c.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=c.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k!=0)
            {
                s+=1;
            }
        }
        System.out.printf("%d",s);
    }
}