import java.util.*;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,s=0,c=0;
        n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            s=s+arr[i];
        }
        a=s/n;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
} 