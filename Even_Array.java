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
            if(arr[i]%2==0)
            {
                c+=1;
            }
        }
        if(c==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
} 