import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.print('
');
        }
    }
}