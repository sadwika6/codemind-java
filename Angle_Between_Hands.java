import java.util.*;
class sample
{
    public static void main(String args[])
    {
        String s;
        Scanner c=new Scanner(System.in);
        s=c.nextLine();
        double h=(s.charAt(0)-48)*10+(s.charAt(1)-48);
        double m=(s.charAt(3)-48)*10+(s.charAt(4)-48);
        double a=11*m/2 -30*h;
        //System.out.print(h);
        //System.out.print(m);
        //System.out.print(s);
        if(a<0)
        {
            a+=360;
        }
        if(a>180)
        {
            a=360-a;
        }
        System.out.print(a);
    }
}