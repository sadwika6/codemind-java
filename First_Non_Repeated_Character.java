import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int z=0;z<n;z++)
        {
            int a=sc.nextInt();
            String s=sc.next();
            int l=s.length();
            int c=0,f=0;
            for(int i=0;i<a;i++)
            {
                c=0;
                for(int j=0;j<a;j++)
                {
                    if(i!=j)
                    {
                        if(s.charAt(i)==s.charAt(j))
                        {
                           c+=1;
                        }
                    }
                }
                if(c==0)
                {
                    System.out.println(s.charAt(i));
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println(-1);
            }
        }
    }
}