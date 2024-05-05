import java.util.Scanner;

public class spy
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=obj.nextInt();
        int temp=num;
        int sum=0;
        int rem;
        int prod=1;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            prod=prod*rem;
            num=num/10;
        }
        if(sum==prod) System.out.println(temp+" is a Spy Number.");
        else System.out.println(temp+" is not a Spy Number.");
    }
}
