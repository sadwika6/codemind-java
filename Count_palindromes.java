import java.util.Scanner;//counr palindromes
class sample
{
    public static void main(String args[])
    {
        int n,c=0,t,r,s=0;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=x.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            s=0;
            t=arr[i];
            while(t!=0)
            {
                r=t%10;
                s=(s*10)+r;
                t=t/10;
            }
            if(s==arr[i])
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}