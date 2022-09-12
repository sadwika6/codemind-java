import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int t;
        Scanner c=new Scanner(System.in);
        t=c.nextInt();
        for(int z=0;z<t;z++)
        {
            int a,s,s1=0;
            a=c.nextInt();
            int arr[]=new int[a-1];
            for(int i=0;i<a-1;i++)
            {
                arr[i]=c.nextInt();
                s1+=arr[i];
            }
            s=(a*(a+1))/2;
            System.out.printf("%d
",s-s1);
        }
    }
}