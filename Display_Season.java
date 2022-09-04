import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        if(a>=1&&a<=12)
        {
            if(a==4||a==5||a==6)
            {
                System.out.printf("Summer");
            }
            else if(a==7||a==8||a==9||a==10)
            {
                System.out.printf("Rainy");
            }
            else if(a==11||a==12||a==1)
            {
                System.out.printf("Winter");
            }
            else
            {
                System.out.printf("Spring");
            }
        }
        else
        {
            System.out.printf("-1");
        }
    }
}