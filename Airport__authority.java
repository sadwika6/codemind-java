import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,t,s=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=c.nextInt();
        }
        t=c.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>t)
            {
                s+=1;
            }
            s+=1;
        }
        System.out.println(s);
    }
}