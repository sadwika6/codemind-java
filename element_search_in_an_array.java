import java.util.Scanner;//counr palindromes
class sample
{
    public static void main(String args[])
    {
        int n,f=0,k;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=x.nextInt();
        }
        k=x.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}