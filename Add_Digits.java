import java.util.Scanner;//counr palindromes
class sample
{
    public static void main(String args[])
    {
        int n,s=0,r;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        while(n!=0)
        {
            r=n%10;
            s+=r;
            n/=10;
            if(s>9 && n==0)
            {
                n=s;
                s=0;
            }
            
        }
        System.out.print(s);
    }
}