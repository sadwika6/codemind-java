import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n1,n2,a,s;
        Scanner c=new Scanner(System.in);
        n1=c.nextInt();
        n2=c.nextInt();
        a=c.nextInt();
        if((n2-n1)>0)
        {
            s=a/(n2-n1);
            System.out.print(s+1);
        }
        else
        {
            System.out.print(-1);
        }
    }
}