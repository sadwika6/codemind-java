import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int a,b;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        b=c.nextInt();
        for(int i=a;i<=(a*b);i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
}