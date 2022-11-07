import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,s=0,c,r;
        n=sc.nextInt();
        a=Math.abs(n);
        c=n;
        while(a!=0)
        {
            r=a%10;
            s=(s*10)+r;
            a/=10;
        }
        if(n<0)
        {
            System.out.print(0-s);
        }
        else
        {
            System.out.print(s);
        }
    }
} 