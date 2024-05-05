import java.util.Scanner;

public class xylem
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int temp=obj.nextInt();


int num=temp;

        int rem=num%10;

        int store3=rem;

        int rest=num/10;
        System.out.println(rest);
        int rev=0;
        while(rest>0)
        {
           rev=rev*10+ (rest % 10);
           rest=rest/10;
        }
        System.out.println(rev);

        int store5=rev%10;

        int sum=store3+store5;
        System.out.println(sum);

        int rest1=rev/10;
        System.out.println(rest1);

        int sum1=0;
        while(rest1>0)
        {

            sum1=sum1+rest1%10;
            rest1=rest1/10;
        }
        System.out.println(sum1);

        if(sum1==sum)
            System.out.println("xylem Number");
        else System.out.println("Not a xylem Number");


    }
}
