import java.util.*;
class sample
{
    public static void main(String args[])
    {
        String s,k;
        Scanner c=new Scanner(System.in);
        s=c.nextLine();
        k=c.next();
        int ct=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==k.charAt(0))
            {
                ct+=1;
            }
        }
        if(ct>0)
        {
            System.out.print(ct);
        }
        else
        {
            System.out.print("-1");
        }
    }
}