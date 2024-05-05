import java.util.Scanner;

public class reverse
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=obj.nextInt();
        int OriginalNum=num;
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
             rev=rev*10+rem;
            System.out.println("reverse number is :"+rev);
             num=num/10;
        }

    }
}
