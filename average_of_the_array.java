import java.util.*;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double a,s=0.0;
        n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            s=s+arr[i];
        }
        a=s/n;
        System.out.printf("%.2f",a);
    }
} 