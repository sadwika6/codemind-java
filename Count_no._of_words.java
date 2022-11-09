import java.util.*;
class sample
{
    public static void main(String args[])
    {
        String s;
        Scanner c=new Scanner(System.in);
        s=c.nextLine();
        int ct=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                ct+=1;
            }
        }
        System.out.print(ct);
    }
}