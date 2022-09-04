import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        char a;
        Scanner c=new Scanner(System.in);
        a=c.next().charAt(0);
        if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        {
            System.out.printf("Vowel");
        }
        else
        {
            System.out.printf("Consonant");
        }
    }
}