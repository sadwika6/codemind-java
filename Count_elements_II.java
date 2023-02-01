import java.util.*;
class Sample
{
    public static boolean search(int arr[],int n,int k)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int l1[]=new int[n];
        int l2[]=new int[m];
        for(int i=0;i<n;i++)
        {
            l1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            l2[i]=sc.nextInt();
        }
        int k[]=new int[n+m];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(search(k,c,l1[i]) && search(l2,m,l1[i]))
            {
                k[c]=l1[i];
                c++;
            }
        }
        for(int i=0;i<m;i++)
        {
            if(search(k,c,l2[i]) && search(l1,n,l2[i]))
            {
                k[c]=l2[i];
                c++;
            }
        }
        System.out.println(c);
    }
}