import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,e=0,o=0;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=x.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                e+=1;
            }
            else
            {
                o+=1;
            }
        }
        System.out.printf("%d %d",e,o);
    }
}