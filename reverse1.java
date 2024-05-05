import java.util.Scanner;

public class reverse1
{
    public static void main(String[] args) {
        m1(8392);


    }
    static void m1(int num)
    {
        int rev=0;
        while (num > 0)
        {

            rev  = rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }
}
