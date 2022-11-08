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
        if(s==p)
        {
            System.out.print("Spy Number");
        }
        else
        {
            System.out.print("Not Spy Number");
        }
    }
}