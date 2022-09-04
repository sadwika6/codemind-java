import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        if(a>0)
        {
            System.out.printf("Positive Number");
        }
        else
        {
            System.out.printf("Negative Number");
        }
    }
}