import java.util.Scanner;//counr palindromes
class sample
{
    public static void main(String args[])
    {
        int p,t,r,s=0;
        Scanner x=new Scanner(System.in);
        p=x.nextInt();
        t=x.nextInt();
        r=x.nextInt();
        s=(p*t*r)/100;
        System.out.print(s);
    }
}