import java.util.*;
class sample
{
    public static void main(String args[])
    {
      double p,r,t,c;
      Scanner sc = new Scanner(System.in);
      p = sc.nextInt();
      r = sc.nextInt();
      t = sc.nextInt();
      c = p * (Math.pow((1 + r / 100), t));
      System.out.format("%.2f",c);
    }
}