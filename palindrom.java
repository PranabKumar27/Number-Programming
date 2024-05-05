import java.util.Scanner;

public class palindrom
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=obj.nextInt();

        int temp=n;
         int rev=0;
         while(n>0)
         {
             int rem=n%10;
             rev=rev*10+rem;
             n=n/10;
         }
         if (temp==rev)
         {
             System.out.println("Palindrom");
         }
         else System.out.println("Not palindrom");
    }
}
