import java.util.Scanner;

public class Armstrong1
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=obj.nextInt();
        int temp=num;
        int length=0;
        while(num>0)
        {
           length++;
           num=num/10;
        }
       num=temp;

       int sum=0;
        while (num<0)
        {
            int power = 1;
            int digit = num % 10;
            for (int i = 1; i <= length; i++)
            {
                power = digit * power;
            }
            sum = sum + power;
            num = num / 10;

        }
        if (temp==sum) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}
