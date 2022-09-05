import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        for(int i=0;i<a;i++)
        {
            int x,y;
            x=c.nextInt();
            y=c.nextInt();
            System.out.printf("%d
",x+y);
        }
    }
}