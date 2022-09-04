import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        String s1,s2;
        int a;
        double r,k;
        Scanner i=new Scanner(System.in);
        s1=i.nextLine();
        s2=i.nextLine();
        a=i.nextInt();
        if(a<200)
        {
            r=a*1.20;
        }
        else if(a>=200 && a<400)
        {
            r=a*1.50;
        }
        else if(a>=400 && a<600)
        {
            r=a*1.80;
        }
        else
        {
            r=a*2.00;
        }
        if(r>400)
        {
            k=r*0.15;
            r+=k;
        }
        else
        {
            r+=100;
        }
        System.out.printf("%.2f",r);
    }
}