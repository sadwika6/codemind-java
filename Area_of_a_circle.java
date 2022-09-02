import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        int ra;
        double area;
        Scanner r=new Scanner(System.in);
        ra=r.nextInt();
        area=3.14*ra*ra;
        System.out.printf("%.2f",area);
    }
}