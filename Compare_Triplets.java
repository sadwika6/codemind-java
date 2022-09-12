import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int a=0,b=0;
        Scanner x=new Scanner(System.in);
        int l1[]=new int[3];
        int l2[]=new int[3];
        for(int i=0;i<3;i++)
        {
            l1[i]=x.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            l2[i]=x.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            if(l1[i]<l2[i])
            {
                a+=1;
            }
            else if(l1[i]>l2[i])
            {
                b+=1;
            }
        }
        System.out.printf("%d %d",b,a);
    }
}