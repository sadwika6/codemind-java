import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n;
        double a,s=0;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=x.nextInt();
            s=s+arr[i];
        }
        a=s/n;
        System.out.printf("%.2f",a);
    }
}