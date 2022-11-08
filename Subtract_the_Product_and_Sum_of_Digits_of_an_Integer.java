import java.util.Scanner;//counr palindromes
class sample
{
    public static void main(String args[])
    {
        int n,s=0,p=1,r;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        while(n!=0)
        {
            r=n%10;
            s+=r;
            p*=r;
            n/=10;
        }
        System.out.print(p-s);
    }
}