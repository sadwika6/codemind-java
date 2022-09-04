import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a;
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        if(a%2==0)
        {
            System.out.printf("Even");
        }
        else
        {
            System.out.printf("Odd");
        }
    }
}