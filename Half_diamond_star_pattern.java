import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        if(n>=3 && n<=100)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print('*');
                }
                System.out.print('
');
            }
            for(int i=n;i>1;i--)
            {
                for(int j=1;j<i;j++)
                {
                    System.out.print('*');
                }
                System.out.print('
');
            }
        }
        else
        {
            System.out.print("The pattern is not possible");
        }
    }
}