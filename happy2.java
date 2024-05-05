import java.util.Scanner;

public class happy2
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=obj.nextInt();

        happy(num);
    }
    static void happy(int a)
    {
        int sum=0;
        while(a>0)
        {
            sum=sum+(int)Math.pow(a%10,2);
            a=a/10;
        }
        if(sum==1) System.out.println("Happy Number");
        else if(sum>9) System.out.println("Not a Happy Number");
        else happy(sum);
    }
}
