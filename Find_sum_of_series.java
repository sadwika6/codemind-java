import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a;
        double s=0;
        Scanner x=new Scanner(System.in);
        a=x.nextInt();
        for(int i=1;i<=a;i++)
        {
            s+=Math.pow(i,-1);
        }
        System.out.printf("%.2f",s);
    }
}