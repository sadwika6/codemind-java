import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int a,b;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        b=c.nextInt();
        int s1=0,s2=0;
        for(int i=1;i<=(a/2);i++)
        {
            if(a%i==0)
            {
                s1+=i;
            }
        }
        for(int i=1;i<=(b/2);i++)
        {
            if(b%i==0)
            {
                s2+=i;
            }
        }
        if(s1==b && s2==a)
        {
            System.out.print("Amicable");
        }
        else
        {
            System.out.print("Not Amicable");
        }
    }
}