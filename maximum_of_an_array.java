import java.util.*;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m;
        n=sc.nextInt();
        int [] a=new int[n];
        m=-10000;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>m)
            {
                m=a[i];
            }
        }
        System.out.printf("%d",m);
        
    }
}