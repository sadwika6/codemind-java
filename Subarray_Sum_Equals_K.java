import java.util.Scanner;//counr palindromes
class sample
{
    public static void main(String args[])
    {
        int n,c=0,k,r,s=0;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        k=x.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=x.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            s=0;
            for(int j=i;j<n;j++)
            {
                s+=arr[j];
                if(s==k)
                {
                    c+=1;
                    break;
                }
                else if(s>k)
                {
                    break;
                }
            }
        }
        System.out.print(c);
    }
}