import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int t,x=0,i=0;
        Scanner c=new Scanner(System.in);
        t=c.nextInt();
        while(i<t)
        {
            String s;
            s=c.next();
            if(s.charAt(1)=='+')
            {
                x+=1;
            }
            else
            {
                x-=1;
            }
            i+=1;
        }
        System.out.print(x);
    }
}