import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a,s=0;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        for(int i=1;i<=(a/2);i++)
        {
            if(a%i==0)
            {
                s+=i;
            }
        }
        if(s>a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}