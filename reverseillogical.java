import java.util.*;
public class reverseillogical
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=obj.nextInt();

        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            System.out.println(rev);
            num=num/10;

        }
        System.out.println(rev+123);
    }
}
