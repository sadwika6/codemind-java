import java.util.*;
class sample
{
    public static void main(String args[])
    {
        String s;
        Scanner c=new Scanner(System.in);
        s=c.next();
        int i,x=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                x+=(s.charAt(i)-'0');
            }
        }
        System.out.print(x);
    }
}