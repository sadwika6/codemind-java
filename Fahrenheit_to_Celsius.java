import java.util.*;
class sample
{
    public static void main(String args[])
    {
        float c,f;
        Scanner sc=new Scanner(System.in);
        f=sc.nextFloat();
        c=(f-32)*5/9;
        System.out.format("%.2f",c);
    }
}