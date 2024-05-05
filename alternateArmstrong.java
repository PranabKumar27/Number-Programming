import java.util.*;
public class alternateArmstrong
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first range");
        int a=s.nextInt();
        System.out.println("Enter second range ");
        int b=s.nextInt();
        int count=0;
        for (int i=1;i<=1000;i++)
        {

            if(amstrong(i))
            {
                count++;
                if(count%2==0)
                System.out.println(i);
            }

        }


    }
    public static boolean amstrong(int n)
    {
        int m = n;
        int count = 0;
        while (n > 0)
        {
            count++;
            n = n / 10;
        }
        n = m;
        int sum=0;
        while (n > 0)
        {
            int r = n % 10;
           int pow=1;
            for (int i = 1; i <= count; i++)
            {
               pow=pow*r;
            }
            sum=sum+pow;
            n = n / 10;
        }
        return sum==m;

    }




    }




