import java.util.*;
class sample
{
    public static void main(String args[])
    {
        int n;
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print('0');
                }
                else
                {
                    System.out.print('x');
                }
            }
            System.out.print("
");
        }
    }
}