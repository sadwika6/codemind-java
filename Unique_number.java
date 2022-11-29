import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n,r,f=0;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        int[] arr=new int[10];
        while(n>0)
        {
            r=n%10;
            arr[r]++;
            n=n/10;
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]>1)
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.print("Unique Number");
        }
        else
        {
            System.out.print("Not Unique Number");
        }
    }
}