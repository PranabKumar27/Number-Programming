import java.util.Scanner;

public class key
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=obj.nextInt();

        int temp=num;
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }

        int key=4;
        int sum=0;
        for (int i=1;i<=key;i++)
        {

            sum=sum+temp%10;
            temp=temp/10;
        }
        System.out.println(sum);

    }
}
